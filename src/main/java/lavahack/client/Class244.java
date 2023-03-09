//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcp.MethodsReturnNonnullByDefault
 *  net.minecraft.block.Block
 *  net.minecraft.block.state.pattern.BlockStateMatcher
 *  net.minecraft.command.CommandException
 *  net.minecraft.command.ICommandSender
 *  net.minecraft.server.MinecraftServer
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentTranslation
 */
package lavahack.client;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import lavahack.client.Class1479;
import lavahack.client.Class2033;
import lavahack.client.Class239;
import lavahack.client.Class46;
import lavahack.client.Class89;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.block.Block;
import net.minecraft.block.state.pattern.BlockStateMatcher;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
public class Class244
extends Class89 {
    private String Field9073 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public String Method1323() {
        return "schematicaReplace";
    }

    public String Method1324(ICommandSender iCommandSender) {
        return "schematica.command.replace.usage";
    }

    public List Method1325(MinecraftServer minecraftServer, ICommandSender iCommandSender, String[] stringArray, @Nullable @Nullable BlockPos blockPos) {
        if (stringArray.length >= 3) return Collections.emptyList();
        return Class244.getListOfStringsMatchingLastWord((String[])stringArray, (Collection)Block.REGISTRY.getKeys());
    }

    public void Method1326(MinecraftServer minecraftServer, ICommandSender iCommandSender, String[] stringArray) throws CommandException {
        Class1479 class1479 = Class46.Field8122;
        if (class1479 == null) {
            throw new CommandException("schematica.command.replace.noSchematic", new Object[0]);
        }
        if (stringArray.length != 2) {
            throw new CommandException("schematica.command.replace.usage", new Object[0]);
        }
        Class239 class239 = Class2033.Method7526(stringArray[0]);
        BlockStateMatcher blockStateMatcher = Class2033.Method7525(class239);
        Class239 class2392 = Class2033.Method7526(stringArray[1]);
        Class2033 class2033 = Class2033.Method7524(class2392.Field9040.getDefaultState());
        int n = class1479.replaceBlock(blockStateMatcher, class2033, class2392.Field9041);
        iCommandSender.sendMessage((ITextComponent)new TextComponentTranslation("schematica.command.replace.success", new Object[]{n}));
    }

    private static String Method1327(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 62;
            cArray2[n] = (char)(cArray[n] ^ (0x5B55 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

