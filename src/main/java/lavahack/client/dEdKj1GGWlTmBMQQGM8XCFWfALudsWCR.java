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
import lavahack.client.OP4La13R7rceTBm7QSP7XXXyRxZD1Op3;
import lavahack.client.XTPdaQTpaLPrMnC0eQEG4onIIgF2nzsH;
import lavahack.client.rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1;
import lavahack.client.rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.sYSQwf2xD3nukbcGapT2KmEMESaueLHM;
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
public class dEdKj1GGWlTmBMQQGM8XCFWfALudsWCR
extends XTPdaQTpaLPrMnC0eQEG4onIIgF2nzsH {
    private String Field9073 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public String Method1323() {
        return "schematicaReplace";
    }

    public String Method1324(ICommandSender iCommandSender) {
        return "schematica.command.replace.usage";
    }

    public List Method1325(MinecraftServer minecraftServer, ICommandSender iCommandSender, String[] stringArray, @Nullable @Nullable BlockPos blockPos) {
        if (stringArray.length >= ((int)1154469191L ^ 0x44CFCD44)) return Collections.emptyList();
        return dEdKj1GGWlTmBMQQGM8XCFWfALudsWCR.getListOfStringsMatchingLastWord((String[])stringArray, (Collection)Block.REGISTRY.getKeys());
    }

    public void Method1326(MinecraftServer minecraftServer, ICommandSender iCommandSender, String[] stringArray) throws CommandException {
        OP4La13R7rceTBm7QSP7XXXyRxZD1Op3 oP4La13R7rceTBm7QSP7XXXyRxZD1Op3 = sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8122;
        if (oP4La13R7rceTBm7QSP7XXXyRxZD1Op3 == null) {
            throw new CommandException("schematica.command.replace.noSchematic", new Object[(int)203440881L ^ 0xC2042F1]);
        }
        if (stringArray.length != ((int)-1192896280L ^ 0xB8E5D8E9) << 1) {
            throw new CommandException("schematica.command.replace.usage", new Object[(int)1542989693L ^ 0x5BF8277D]);
        }
        rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1$leqS0IyKEB621E1SrHdAcHHAUjScjmKi rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1.Method7526(stringArray[(int)((long)2144911251 ^ (long)2144911251)]);
        BlockStateMatcher blockStateMatcher = rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1.Method7525(rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1$leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
        rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1$leqS0IyKEB621E1SrHdAcHHAUjScjmKi rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2 = rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1.Method7526(stringArray[(int)736811557L ^ 0x2BEADA24]);
        rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1 rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD12 = rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1.Method7524(rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2.Field9040.getDefaultState());
        int n = oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.replaceBlock(blockStateMatcher, rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD12, rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2.Field9041);
        Object[] objectArray = new Object[(int)((long)-1426051580 ^ (long)-1426051579)];
        objectArray[(int)((long)-996196368 ^ (long)-996196368)] = n;
        iCommandSender.sendMessage((ITextComponent)new TextComponentTranslation("schematica.command.replace.success", objectArray));
    }

    private static String Method1327(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1899697909L ^ 0x713B16F5;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1599106330L ^ 0x5F506DE5);
            int n2 = ((int)-1801949676L ^ 0x94986E0B) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1493423493 ^ (long)1493405392) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

