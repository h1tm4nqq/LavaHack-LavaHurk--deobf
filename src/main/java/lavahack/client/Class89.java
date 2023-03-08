//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import mcp.*;
import net.minecraft.server.*;
import net.minecraft.command.*;
import net.minecraft.entity.player.*;
import javax.annotation.*;
import net.minecraft.util.text.*;
import net.minecraft.util.text.event.*;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
public abstract class Class89 extends CommandBase
{
    private String Field8301 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public int getRequiredPermissionLevel() {
        return 0;
    }
    
    public boolean checkPermission(final MinecraftServer minecraftServer, final ICommandSender commandSender) {
        return super.checkPermission(minecraftServer, commandSender) || (commandSender instanceof EntityPlayerMP && this.getRequiredPermissionLevel() <= 0);
    }
    
    protected ITextComponent withStyle(final ITextComponent textComponent, final TextFormatting textFormatting, @Nullable @Nullable final String s) {
        final Style style = new Style();
        style.setColor(textFormatting);
        if (s != null) {
            style.setClickEvent(new ClickEvent(ClickEvent$Action.RUN_COMMAND, s));
        }
        textComponent.setStyle(style);
        return textComponent;
    }
}
