#shader vert
#version 130

void main(void) {
    gl_Position = gl_ModelViewProjectionMatrix * gl_Vertex;
    gl_TexCoord[0] = gl_MultiTexCoord0;
}

#shader frag
#version 130

// uniform sampler2D sampler;
uniform sampler2D overlaySampler;
uniform sampler2D sampler;
uniform vec2 dimensions;
uniform float imageX;
uniform float imageY;
uniform float imageWidth;
uniform float imageHeight;
uniform float mixFactor;
uniform float colorMixFactor;
uniform vec4 inputColor;

// uniform vec4 imageDimensions;
// uniform vec2 dimensions;

// todo: broken
vec4 blur13(sampler2D image, vec2 uv, vec2 resolution, vec2 direction) {
    vec4 color = vec4(0.0);
    vec2 off1 = vec2(1.411764705882353) * direction;
    vec2 off2 = vec2(3.2941176470588234) * direction;
    vec2 off3 = vec2(5.176470588235294) * direction;
    color += texture(image, uv) * 0.1964825501511404;
    color += texture(image, uv + (off1 / resolution)) * 0.2969069646728344;
    color += texture(image, uv - (off1 / resolution)) * 0.2969069646728344;
    color += texture(image, uv + (off2 / resolution)) * 0.09447039785044732;
    color += texture(image, uv - (off2 / resolution)) * 0.09447039785044732;
    color += texture(image, uv + (off3 / resolution)) * 0.010381362401148057;
    color += texture(image, uv - (off3 / resolution)) * 0.010381362401148057;
    return color;
}

void main() {
    // vec2 coords1 = vec2(gl_FragCoord.x / imageDimensions.z, gl_FragCoord.y / imageDimensions.w);
    if (gl_FragCoord.x >= imageX && gl_FragCoord.y >= imageY && gl_FragCoord.x <= (imageX + imageWidth) && gl_FragCoord.y <= (imageY + imageHeight)) {
        vec2 coords = vec2(((gl_FragCoord.x - imageX) / imageWidth), ((gl_FragCoord.y - imageY) / imageHeight));
        vec4 blurColor = blur13(sampler, gl_TexCoord[0].xy / dimensions, dimensions, vec2(1, 0));
        vec4 blurOverlay = blur13(overlaySampler, gl_FragCoord.xy / dimensions, dimensions, vec2(1, 0));
        vec4 color = mix(texture(sampler, gl_TexCoord[0].xy), texture(overlaySampler, coords), mixFactor);
        vec4 finalColor = mix(blurColor, blurOverlay, mixFactor);
        color.xyz = mix(color.xyz, inputColor.xyz, colorMixFactor);
        finalColor.xyz = mix(finalColor.xyz, inputColor.xyz, colorMixFactor);
        color.a = inputColor.a;
        finalColor.a = inputColor.a;
        gl_FragColor = finalColor;
    } else {
        gl_FragColor = vec4(1, 1, 1, 1);
    }
    /*if (gl_FragCoord.x >= floor(imageDimensions.x) && gl_FragCoord.y >= floor(imageDimensions.y)) {
        gl_FragColor = texture(overlaySampler, coords);
    } else {
        gl_FragColor = vec4(1, 1, 1, 1); // this won't get rendered anyway, just compiler bait :P
    }*/


    // gl_FragColor = texture(overlaySampler, vec2(gl_FragCoord.x / dimensions.x, gl_FragCoord.y / dimensions.y));

}