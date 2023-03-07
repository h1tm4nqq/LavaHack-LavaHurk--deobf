//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.settings.KeyBinding
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.RayTraceResult$Type
 *  net.minecraft.world.World
 *  net.minecraftforge.client.settings.IKeyConflictContext
 *  net.minecraftforge.client.settings.KeyConflictContext
 *  net.minecraftforge.client.settings.KeyModifier
 *  net.minecraftforge.common.ForgeHooks
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.InputEvent
 */
package lavahack.client;

import lavahack.client.OP4La13R7rceTBm7QSP7XXXyRxZD1Op3;
import lavahack.client.OP4La13R7rceTBm7QSP7XXXyRxZD1Op3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.Y7MJXqsFEyMDfjLtI7kgWuxROmcVitch;
import lavahack.client.YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo;
import lavahack.client.obJ0VWHLNmQ3JG7JGnha7msMzoxHZ7eU;
import lavahack.client.sYSQwf2xD3nukbcGapT2KmEMESaueLHM;
import lavahack.client.wTT69buSmsUGMaHe8NhIqgZr7Hb6tunb;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.client.settings.IKeyConflictContext;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.client.settings.KeyModifier;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class p3VRxk9hbkZHFP0EfsVlgJwxBnCVRjan {
    public static final p3VRxk9hbkZHFP0EfsVlgJwxBnCVRjan Field9563 = new p3VRxk9hbkZHFP0EfsVlgJwxBnCVRjan();
    private static final KeyBinding Field9564 = new KeyBinding("schematica.key.load", (int)((long)-1197004930 ^ (long)-1197004853), "schematica.key.category");
    private static final KeyBinding Field9565 = new KeyBinding("schematica.key.save", (int)-2096263081L ^ 0x830D9060, "schematica.key.category");
    private static final KeyBinding Field9566 = new KeyBinding("schematica.key.control", (int)((long)658077939 ^ (long)658077910) << 1, "schematica.key.category");
    private static final KeyBinding Field9567 = new KeyBinding("schematica.key.layerInc", (int)1393857738L ^ 0x531494CA, "schematica.key.category");
    private static final KeyBinding Field9568 = new KeyBinding("schematica.key.layerDec", (int)1732724878L ^ 0x6747488E, "schematica.key.category");
    private static final KeyBinding Field9569 = new KeyBinding("schematica.key.layerToggle", (int)-1552926069L ^ 0xA3703A8B, "schematica.key.category");
    private static final KeyBinding Field9570 = new KeyBinding("schematica.key.renderToggle", (int)((long)1582147821 ^ (long)1582147821), "schematica.key.category");
    private static final KeyBinding Field9571 = new KeyBinding("schematica.key.moveHere", (int)((long)330201895 ^ (long)330201895), "schematica.key.category");
    private static final KeyBinding Field9572 = new KeyBinding("schematica.key.pickBlock", (IKeyConflictContext)KeyConflictContext.IN_GAME, KeyModifier.SHIFT, (int)2069996100L ^ 0x849E5DDA, "schematica.key.category");
    public static final KeyBinding[] Field9573;
    private final Minecraft Field9574 = Minecraft.getMinecraft();
    private String Field9575 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private p3VRxk9hbkZHFP0EfsVlgJwxBnCVRjan() {
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method1824(InputEvent inputEvent) {
        OP4La13R7rceTBm7QSP7XXXyRxZD1Op3 oP4La13R7rceTBm7QSP7XXXyRxZD1Op3;
        if (this.Field9574.currentScreen != null) return;
        if (Field9564.isPressed()) {
            this.Field9574.displayGuiScreen((GuiScreen)new obJ0VWHLNmQ3JG7JGnha7msMzoxHZ7eU(this.Field9574.currentScreen));
        }
        if (Field9565.isPressed()) {
            this.Field9574.displayGuiScreen((GuiScreen)new wTT69buSmsUGMaHe8NhIqgZr7Hb6tunb(this.Field9574.currentScreen));
        }
        if (Field9566.isPressed()) {
            this.Field9574.displayGuiScreen((GuiScreen)new Y7MJXqsFEyMDfjLtI7kgWuxROmcVitch(this.Field9574.currentScreen));
        }
        if (Field9567.isPressed() && (oP4La13R7rceTBm7QSP7XXXyRxZD1Op3 = sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8122) != null && oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14898 != OP4La13R7rceTBm7QSP7XXXyRxZD1Op3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10633) {
            oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14899 = MathHelper.clamp((int)(oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14899 + ((int)-168027644L ^ 0xF5FC1A05)), (int)((int)-1670813946L ^ 0x9C696706), (int)(oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getHeight() - (int)((long)2040517005 ^ (long)2040517004)));
            YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11944.refresh();
        }
        if (Field9568.isPressed() && (oP4La13R7rceTBm7QSP7XXXyRxZD1Op3 = sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8122) != null && oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14898 != OP4La13R7rceTBm7QSP7XXXyRxZD1Op3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10633) {
            oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14899 = MathHelper.clamp((int)(oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14899 - ((int)1151171051L ^ 0x449D79EA)), (int)((int)((long)1926403834 ^ (long)1926403834)), (int)(oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getHeight() - (int)((long)-35965292 ^ (long)-35965291)));
            YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11944.refresh();
        }
        if (Field9569.isPressed() && (oP4La13R7rceTBm7QSP7XXXyRxZD1Op3 = sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8122) != null) {
            oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14898 = OP4La13R7rceTBm7QSP7XXXyRxZD1Op3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method1105(oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14898);
            YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11944.refresh();
        }
        if (Field9570.isPressed() && (oP4La13R7rceTBm7QSP7XXXyRxZD1Op3 = sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8122) != null) {
            oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14897 = !oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14897 ? (int)909846352L ^ 0x363B2751 : (int)((long)2081195033 ^ (long)2081195033);
            YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11944.refresh();
        }
        if (Field9571.isPressed() && (oP4La13R7rceTBm7QSP7XXXyRxZD1Op3 = sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8122) != null) {
            sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Method425(oP4La13R7rceTBm7QSP7XXXyRxZD1Op3);
            YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11944.refresh();
        }
        if (!Field9572.isPressed()) return;
        oP4La13R7rceTBm7QSP7XXXyRxZD1Op3 = sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8122;
        if (oP4La13R7rceTBm7QSP7XXXyRxZD1Op3 == null) return;
        if (!oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14897) return;
        this.Method1825(oP4La13R7rceTBm7QSP7XXXyRxZD1Op3, sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8129);
    }

    private boolean Method1825(OP4La13R7rceTBm7QSP7XXXyRxZD1Op3 oP4La13R7rceTBm7QSP7XXXyRxZD1Op3, RayTraceResult rayTraceResult) {
        if (rayTraceResult == null) {
            return (int)((long)1755665746 ^ (long)1755665746) != 0;
        }
        if (rayTraceResult.typeOfHit == RayTraceResult.Type.MISS) {
            return ((int)-1963338346L ^ 0x8AF9D596) != 0;
        }
        EntityPlayerSP entityPlayerSP = this.Field9574.player;
        if (!ForgeHooks.onPickBlock((RayTraceResult)rayTraceResult, (EntityPlayer)entityPlayerSP, (World)oP4La13R7rceTBm7QSP7XXXyRxZD1Op3)) {
            return ((int)-1501308835L ^ 0xA683D85C) != 0;
        }
        if (!entityPlayerSP.capabilities.isCreativeMode) return ((int)196992197L ^ 0xBBDDCC5) != 0;
        int n = entityPlayerSP.inventoryContainer.inventorySlots.size() - (((int)1726336226L ^ 0x66E5CCE7) << 1) + entityPlayerSP.inventory.currentItem;
        this.Field9574.playerController.sendSlotPacket(entityPlayerSP.inventory.getStackInSlot(entityPlayerSP.inventory.currentItem), n);
        return (int)((long)-1383668081 ^ (long)-1383668082) != 0;
    }

    static {
        KeyBinding[] keyBindingArray = new KeyBinding[(int)((long)1002646615 ^ (long)1002646622)];
        keyBindingArray[(int)1210152217L ^ 0x48217519] = Field9564;
        keyBindingArray[(int)((long)-1439045871 ^ (long)-1439045872)] = Field9565;
        keyBindingArray[(int)((long)109030704 ^ (long)109030705) << 1] = Field9566;
        keyBindingArray[(int)280462676L ^ 0x10B78557] = Field9567;
        keyBindingArray[((int)-369730729L ^ 0xE9F65B56) << 2] = Field9568;
        keyBindingArray[(int)((long)-1762157760 ^ (long)-1762157755)] = Field9569;
        keyBindingArray[((int)-1717119595L ^ 0x99A6D596) << 1] = Field9570;
        keyBindingArray[(int)((long)758106008 ^ (long)758106015)] = Field9571;
        keyBindingArray[((int)1630203895L ^ 0x612AEFF6) << 3] = Field9572;
        Field9573 = keyBindingArray;
    }

    private static String Method1826(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1622288151L ^ 0x60B22717;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)768563126 ^ (long)768563017);
            int n2 = (int)1165832960L ^ 0x457D339F;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)250836048 ^ (long)250838129) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

