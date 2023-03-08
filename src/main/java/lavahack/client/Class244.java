//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import mcp.*;
import net.minecraft.server.*;
import net.minecraft.util.math.*;
import javax.annotation.*;
import net.minecraft.block.*;
import java.util.*;
import net.minecraft.command.*;
import net.minecraft.util.text.*;
import net.minecraft.block.state.pattern.*;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
public class Class244 extends Class89
{
    private String Field9073 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public String Method1323() {
        return "schematicaReplace";
    }
    
    public String Method1324(final ICommandSender commandSender) {
        return "schematica.command.replace.usage";
    }
    
    public List Method1325(final MinecraftServer minecraftServer, final ICommandSender commandSender, final String[] array, @Nullable @Nullable final BlockPos blockPos) {
        if (array.length < 3) {
            return getListOfStringsMatchingLastWord(array, (Collection)Block.REGISTRY.getKeys());
        }
        return Collections.emptyList();
    }
    
    public void Method1326(final MinecraftServer minecraftServer, final ICommandSender commandSender, final String[] array) throws CommandException {
        final Class1479 field8122 = Class46.Field8122;
        if (field8122 == null) {
            throw new CommandException("schematica.command.replace.noSchematic", new Object[0]);
        }
        if (array.length != 2) {
            throw new CommandException("schematica.command.replace.usage", new Object[0]);
        }
        final BlockStateMatcher method7525 = Class2033.Method7525(Class2033.Method7526(array[0]));
        final Class239 method7526 = Class2033.Method7526(array[1]);
        commandSender.sendMessage((ITextComponent)new TextComponentTranslation("schematica.command.replace.success", new Object[] { field8122.replaceBlock(method7525, Class2033.Method7524(method7526.Field9040.getDefaultState()), method7526.Field9041) }));
    }
    
    private static String Method1327(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5B55 ^ 0x3E));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
