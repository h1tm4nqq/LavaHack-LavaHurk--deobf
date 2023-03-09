//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.World
 *  net.minecraft.world.chunk.EmptyChunk
 */
package lavahack.client;

import lavahack.client.Class1129;
import net.minecraft.world.World;
import net.minecraft.world.chunk.EmptyChunk;

class Class316
extends EmptyChunk {
    final Class1129 Field9335;
    private String Field9336 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    Class316(Class1129 class1129, World world, int n, int n2) {
        this.Field9335 = class1129;
        super(world, n, n2);
    }

    public boolean isEmpty() {
        return false;
    }
}

