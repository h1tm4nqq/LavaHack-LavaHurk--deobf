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
public abstract class XTPdaQTpaLPrMnC0eQEG4onIIgF2nzsH
extends CommandBase {
    private String Field8301 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public int getRequiredPermissionLevel() {
        return (int)((long)-1197966007 ^ (long)-1197966007);
    }

    public boolean checkPermission(MinecraftServer minecraftServer, ICommandSender iCommandSender) {
        int n;
        if (super.checkPermission(minecraftServer, iCommandSender) || iCommandSender instanceof EntityPlayerMP && this.getRequiredPermissionLevel() <= 0) {
            n = (int)((long)-228149101 ^ (long)-228149102);
            return n != 0;
        }
        n = (int)((long)-1865529989 ^ (long)-1865529989);
        return n != 0;
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

