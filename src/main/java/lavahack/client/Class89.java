//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcp.MethodsReturnNonnullByDefault
 *  net.minecraft.command.CommandBase
 *  net.minecraft.command.ICommandSender
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.server.MinecraftServer
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.Style
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraft.util.text.event.ClickEvent
 *  net.minecraft.util.text.event.ClickEvent$Action
 */
package lavahack.client;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.event.ClickEvent;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
public abstract class Class89
extends CommandBase {
    private String Field8301 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public int getRequiredPermissionLevel() {
        return 0;
    }

    public boolean checkPermission(MinecraftServer minecraftServer, ICommandSender iCommandSender) {
        if (super.checkPermission(minecraftServer, iCommandSender)) return true;
        if (!(iCommandSender instanceof EntityPlayerMP)) return false;
        if (this.getRequiredPermissionLevel() > 0) return false;
        return true;
    }

    protected ITextComponent withStyle(ITextComponent iTextComponent, TextFormatting textFormatting, @Nullable @Nullable String string) {
        Style style = new Style();
        style.setColor(textFormatting);
        if (string != null) {
            style.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, string));
        }
        iTextComponent.setStyle(style);
        return iTextComponent;
    }
}

