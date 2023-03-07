/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.GtblxmdXrOz1ETXFTxPJkkfSolzpOFYh;
import lavahack.client.Hbz9o7cw3UHbaO4ZnEUfDRM6OJGZSWeF;
import lavahack.client.MqsrRQnbRy9isdddkl92UP1ECk0bQjwC;
import lavahack.client.PjyUTexLYwnCwZQrK5cNTD4oVgzpoq9s;
import lavahack.client.RGCLsXzmsonHUe70KfwUCFuOkmzgiIrE;
import lavahack.client.SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr;
import lavahack.client.WieLcrIxU3iYF11f2EiUDyi7gNqAZWP8;
import lavahack.client.cr0M8mK9GGI5hAZcYO5z8A4281TSSYrL;
import lavahack.client.rTJG0nfcS1JpLt6DNhjjGVN31WF21125;
import lavahack.client.rb6kaOGNeY6SyUX9eH7V9KSJeKVNOo6P;
import lavahack.client.tbVaBIES7426XFKhjsNa3Vjv17G7SCLB;
import lavahack.client.xQLJWypRXLpADxTMqBqqs4AvrYMiX0Yw;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\b"}, d2={"Lcom/kisman/cc/util/enums/ShadersShaders$Snow;", "Lcom/kisman/cc/util/enums/ShadersShaders;", "updateUniforms", "", "pattern", "Lcom/kisman/cc/settings/util/ShadersRendererPattern;", "framebuffer", "Lcom/kisman/cc/util/render/shader/framebuffer/FramebufferShader;", "kisman.cc"})
final class rTJG0nfcS1JpLt6DNhjjGVN31WF21125$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV
extends rTJG0nfcS1JpLt6DNhjjGVN31WF21125 {
    private int Field11706;

    @Override
    public void Method1479(@NotNull @NotNull GtblxmdXrOz1ETXFTxPJkkfSolzpOFYh gtblxmdXrOz1ETXFTxPJkkfSolzpOFYh, @NotNull @NotNull rb6kaOGNeY6SyUX9eH7V9KSJeKVNOo6P rb6kaOGNeY6SyUX9eH7V9KSJeKVNOo6P2) {
        Intrinsics.checkParameterIsNotNull((Object)gtblxmdXrOz1ETXFTxPJkkfSolzpOFYh, (String)"pattern");
        Intrinsics.checkParameterIsNotNull((Object)rb6kaOGNeY6SyUX9eH7V9KSJeKVNOo6P2, (String)"framebuffer");
        Object object = gtblxmdXrOz1ETXFTxPJkkfSolzpOFYh.Method5924();
        Object object2 = this.Method1489();
        int n = (int)-1578781927L ^ 0xA1E5B319;
        Object object3 = object;
        int n2 = (int)((long)-79791783 ^ (long)-79791783);
        if (!object3.containsKey(object2)) return;
        object = (SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr)gtblxmdXrOz1ETXFTxPJkkfSolzpOFYh.Method5924().get(this.Method1489());
        Iterator iterator = this.Method1484().iterator();
        while (iterator.hasNext()) {
            object2 = (PjyUTexLYwnCwZQrK5cNTD4oVgzpoq9s)iterator.next();
            if (((PjyUTexLYwnCwZQrK5cNTD4oVgzpoq9s)object2).Method3417() != null) {
                Boolean bl;
                Object object4 = object;
                if (object4 != null && (object4 = (HashMap)((SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr)object4).Method6308()) != null) {
                    object3 = (Map)object4;
                    Integer n3 = ((PjyUTexLYwnCwZQrK5cNTD4oVgzpoq9s)object2).Method3418();
                    int n4 = (int)((long)1116780901 ^ (long)1116780901);
                    Map map = object3;
                    int n5 = (int)1138349105L ^ 0x43D9D431;
                    bl = map.containsKey(n3);
                } else {
                    bl = null;
                }
                if (bl == null) {
                    Intrinsics.throwNpe();
                }
                if (!bl.booleanValue()) continue;
                Object v = ((HashMap)((SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr)object).Method6308()).get(((PjyUTexLYwnCwZQrK5cNTD4oVgzpoq9s)object2).Method3418());
                if (v == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(v, (String)"bind.second[uniform.index]!!");
                object3 = (RGCLsXzmsonHUe70KfwUCFuOkmzgiIrE)v;
                if (((Hbz9o7cw3UHbaO4ZnEUfDRM6OJGZSWeF)object2).Method3413() instanceof tbVaBIES7426XFKhjsNa3Vjv17G7SCLB) {
                    WieLcrIxU3iYF11f2EiUDyi7gNqAZWP8 wieLcrIxU3iYF11f2EiUDyi7gNqAZWP8 = ((Hbz9o7cw3UHbaO4ZnEUfDRM6OJGZSWeF)object2).Method3413();
                    if (wieLcrIxU3iYF11f2EiUDyi7gNqAZWP8 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.render.shader.uniform.type.types.TypeInt");
                    }
                    ((tbVaBIES7426XFKhjsNa3Vjv17G7SCLB)wieLcrIxU3iYF11f2EiUDyi7gNqAZWP8).Method648(((RGCLsXzmsonHUe70KfwUCFuOkmzgiIrE)object3).Method1984().Method335());
                } else if (((Hbz9o7cw3UHbaO4ZnEUfDRM6OJGZSWeF)object2).Method3413() instanceof MqsrRQnbRy9isdddkl92UP1ECk0bQjwC) {
                    WieLcrIxU3iYF11f2EiUDyi7gNqAZWP8 wieLcrIxU3iYF11f2EiUDyi7gNqAZWP8 = ((Hbz9o7cw3UHbaO4ZnEUfDRM6OJGZSWeF)object2).Method3413();
                    if (wieLcrIxU3iYF11f2EiUDyi7gNqAZWP8 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.render.shader.uniform.type.types.TypeFloat");
                    }
                    ((MqsrRQnbRy9isdddkl92UP1ECk0bQjwC)wieLcrIxU3iYF11f2EiUDyi7gNqAZWP8).Method648(Float.valueOf(((RGCLsXzmsonHUe70KfwUCFuOkmzgiIrE)object3).Method1984().Method368()));
                } else if (((Hbz9o7cw3UHbaO4ZnEUfDRM6OJGZSWeF)object2).Method3413() instanceof cr0M8mK9GGI5hAZcYO5z8A4281TSSYrL) {
                    WieLcrIxU3iYF11f2EiUDyi7gNqAZWP8 wieLcrIxU3iYF11f2EiUDyi7gNqAZWP8 = ((Hbz9o7cw3UHbaO4ZnEUfDRM6OJGZSWeF)object2).Method3413();
                    if (wieLcrIxU3iYF11f2EiUDyi7gNqAZWP8 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.render.shader.uniform.type.types.TypeBool");
                    }
                    ((cr0M8mK9GGI5hAZcYO5z8A4281TSSYrL)wieLcrIxU3iYF11f2EiUDyi7gNqAZWP8).Method648(((RGCLsXzmsonHUe70KfwUCFuOkmzgiIrE)object3).Method1984().Method365());
                }
                WieLcrIxU3iYF11f2EiUDyi7gNqAZWP8 wieLcrIxU3iYF11f2EiUDyi7gNqAZWP8 = ((Hbz9o7cw3UHbaO4ZnEUfDRM6OJGZSWeF)object2).Method3413();
                Object v2 = rb6kaOGNeY6SyUX9eH7V9KSJeKVNOo6P2.Method912().get(((Hbz9o7cw3UHbaO4ZnEUfDRM6OJGZSWeF)object2).Method3414());
                if (v2 == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(v2, (String)"framebuffer.uniformsRaw[uniform.name]!!");
                wieLcrIxU3iYF11f2EiUDyi7gNqAZWP8.Method646(((Number)v2).intValue());
                continue;
            }
            if (this.Method1488() && Intrinsics.areEqual((Object)((Hbz9o7cw3UHbaO4ZnEUfDRM6OJGZSWeF)object2).Method3414(), (Object)"resolution")) {
                Object object5 = object2;
                if (object5 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.render.shader.uniform.Uniform<com.kisman.cc.util.render.shader.uniform.type.types.TypeVec2Float>");
                }
                xQLJWypRXLpADxTMqBqqs4AvrYMiX0Yw.Method5111((Hbz9o7cw3UHbaO4ZnEUfDRM6OJGZSWeF)object5);
                continue;
            }
            if (this.Method1487() && Intrinsics.areEqual((Object)((Hbz9o7cw3UHbaO4ZnEUfDRM6OJGZSWeF)object2).Method3414(), (Object)"texelSize")) {
                Float f;
                Float f2;
                Object object6 = object2;
                if (object6 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.render.shader.uniform.Uniform<com.kisman.cc.util.render.shader.uniform.type.types.TypeVec2Float>");
                }
                Hbz9o7cw3UHbaO4ZnEUfDRM6OJGZSWeF hbz9o7cw3UHbaO4ZnEUfDRM6OJGZSWeF = (Hbz9o7cw3UHbaO4ZnEUfDRM6OJGZSWeF)object6;
                if (this.Method1490() == ((int)-680847402L ^ 0x2894E829)) {
                    f2 = Float.valueOf(1.0f);
                } else {
                    WieLcrIxU3iYF11f2EiUDyi7gNqAZWP8 wieLcrIxU3iYF11f2EiUDyi7gNqAZWP8 = ((PjyUTexLYwnCwZQrK5cNTD4oVgzpoq9s)this.Method1484().get(this.Method1490())).Method3413();
                    if (wieLcrIxU3iYF11f2EiUDyi7gNqAZWP8 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.render.shader.uniform.type.types.TypeFloat");
                    }
                    f2 = (Float)((MqsrRQnbRy9isdddkl92UP1ECk0bQjwC)wieLcrIxU3iYF11f2EiUDyi7gNqAZWP8).Method647();
                }
                Intrinsics.checkExpressionValueIsNotNull((Object)f2, (String)"if(radiusIndex == -1) {\n\u2026                        }");
                float f3 = f2.floatValue();
                if (this.Method1491() == ((int)497393374L ^ 0xE25A6121)) {
                    f = Float.valueOf(1.0f);
                } else {
                    WieLcrIxU3iYF11f2EiUDyi7gNqAZWP8 wieLcrIxU3iYF11f2EiUDyi7gNqAZWP8 = ((PjyUTexLYwnCwZQrK5cNTD4oVgzpoq9s)this.Method1484().get(this.Method1491())).Method3413();
                    if (wieLcrIxU3iYF11f2EiUDyi7gNqAZWP8 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.render.shader.uniform.type.types.TypeFloat");
                    }
                    f = (Float)((MqsrRQnbRy9isdddkl92UP1ECk0bQjwC)wieLcrIxU3iYF11f2EiUDyi7gNqAZWP8).Method647();
                }
                Intrinsics.checkExpressionValueIsNotNull((Object)f, (String)"if(qualityIndex == -1) {\u2026                        }");
                xQLJWypRXLpADxTMqBqqs4AvrYMiX0Yw.Method5110(hbz9o7cw3UHbaO4ZnEUfDRM6OJGZSWeF, f3, f.floatValue());
                continue;
            }
            Intrinsics.areEqual((Object)((Hbz9o7cw3UHbaO4ZnEUfDRM6OJGZSWeF)object2).Method3414(), (Object)"time");
        }
    }

    rTJG0nfcS1JpLt6DNhjjGVN31WF21125$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(String string, int n) {
        Object[] objectArray = new PjyUTexLYwnCwZQrK5cNTD4oVgzpoq9s[((int)-1317828908L ^ 0xB17386D5) << 2];
        objectArray[(int)((long)82163909 ^ (long)82163909)] = new PjyUTexLYwnCwZQrK5cNTD4oVgzpoq9s(null, xQLJWypRXLpADxTMqBqqs4AvrYMiX0Yw.Method5108(), (int)-694246670L ^ 0xD69EA2F2);
        objectArray[(int)71062403L ^ 0x43C5382] = new PjyUTexLYwnCwZQrK5cNTD4oVgzpoq9s(null, new Hbz9o7cw3UHbaO4ZnEUfDRM6OJGZSWeF("time").Method3412(new MqsrRQnbRy9isdddkl92UP1ECk0bQjwC()), (int)((long)380484793 ^ (long)380484792));
        objectArray[((int)-805581546L ^ 0xCFFBCD17) << 1] = new PjyUTexLYwnCwZQrK5cNTD4oVgzpoq9s(null, xQLJWypRXLpADxTMqBqqs4AvrYMiX0Yw.Method5112(), ((int)-2043526450L ^ 0x863242CF) << 1);
        objectArray[(int)((long)-1288655326 ^ (long)-1288655327)] = new PjyUTexLYwnCwZQrK5cNTD4oVgzpoq9s("Mouse", new Hbz9o7cw3UHbaO4ZnEUfDRM6OJGZSWeF("mouse").Method3412(new MqsrRQnbRy9isdddkl92UP1ECk0bQjwC()), (int)((long)683373221 ^ (long)683373222));
    }

    private static String Method1492(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-328837611 ^ (long)-328837611);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-2055691530 ^ (long)-2055691767);
            int n2 = (int)((long)-1205521974 ^ (long)-1205521959) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1867508610 ^ (long)1867503725) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

