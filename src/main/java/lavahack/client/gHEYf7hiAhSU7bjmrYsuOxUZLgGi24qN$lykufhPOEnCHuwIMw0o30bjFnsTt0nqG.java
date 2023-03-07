//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.entity.item.EntityArmorStand
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItem
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.world.World
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.RAmrx1XwuYiH2lhbXcpWmBrbN4Wx35PV;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "kotlin.jvm.PlatformType", "invoke"})
final class gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    public static final gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG Field11108 = new gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG();
    private int Field11109;

    @Override
    public void Method979(Object object) {
        this.Method3058((TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV)object);
    }

    /*
     * Unable to fully structure code
     */
    public final void Method3058(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV var1_1) {
        block12: {
            v0 = var1_1;
            Intrinsics.checkExpressionValueIsNotNull((Object)v0, (String)"it");
            var2_2 = v0.Method982();
            if (!(var2_2 instanceof CPacketPlayerTryUseItemOnBlock) || gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7080().objectMouseOver == null) break block12;
            v1 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7083(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16809);
            Intrinsics.checkExpressionValueIsNotNull((Object)v1, (String)"noInteractVal");
            if (!v1.Method365()) break block12;
            v2 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7080().objectMouseOver.typeOfHit;
            if (v2 == null) {
                Intrinsics.throwNpe();
            }
            switch (RAmrx1XwuYiH2lhbXcpWmBrbN4Wx35PV.Field12476[v2.ordinal()]) {
                case 1: {
                    v3 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7086(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16809);
                    Intrinsics.checkExpressionValueIsNotNull((Object)v3, (String)"ntArmorStand");
                    if (!v3.Method365() || !(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7080().objectMouseOver.entityHit instanceof EntityArmorStand)) break;
                    v4 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7087(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16809);
                    Intrinsics.checkExpressionValueIsNotNull((Object)v4, (String)"ntReplacePacket");
                    if (v4.Method365()) {
                        gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7080().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(((CPacketPlayerTryUseItemOnBlock)var2_2).hand));
                    }
                    var1_1.Method158();
                    break;
                }
                case 2: {
                    v5 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7080().world;
                    v6 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7080().objectMouseOver;
                    Intrinsics.checkExpressionValueIsNotNull((Object)v6, (String)"mc.objectMouseOver");
                    v7 = v5.getBlockState(v6.getBlockPos());
                    Intrinsics.checkExpressionValueIsNotNull((Object)v7, (String)"mc.world.getBlockState(m\u2026objectMouseOver.blockPos)");
                    var3_3 = v7.getBlock();
                    if (!Intrinsics.areEqual((Object)var3_3, (Object)Blocks.ENDER_CHEST)) ** GOTO lbl33
                    v8 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7088(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16809);
                    Intrinsics.checkExpressionValueIsNotNull((Object)v8, (String)"ntEnderChest");
                    if (v8.Method365()) ** GOTO lbl49
lbl33:
                    // 2 sources

                    if (!Intrinsics.areEqual((Object)var3_3, (Object)Blocks.CRAFTING_TABLE)) ** GOTO lbl37
                    v9 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7089(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16809);
                    Intrinsics.checkExpressionValueIsNotNull((Object)v9, (String)"ntCraftingTable");
                    if (v9.Method365()) ** GOTO lbl49
lbl37:
                    // 2 sources

                    if (!Intrinsics.areEqual((Object)var3_3, (Object)Blocks.CHEST)) ** GOTO lbl41
                    v10 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7090(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16809);
                    Intrinsics.checkExpressionValueIsNotNull((Object)v10, (String)"ntChest");
                    if (v10.Method365()) ** GOTO lbl49
lbl41:
                    // 2 sources

                    if (!Intrinsics.areEqual((Object)var3_3, (Object)Blocks.FURNACE)) ** GOTO lbl45
                    v11 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7091(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16809);
                    Intrinsics.checkExpressionValueIsNotNull((Object)v11, (String)"ntFurnace");
                    if (v11.Method365()) ** GOTO lbl49
lbl45:
                    // 2 sources

                    if (!Intrinsics.areEqual((Object)var3_3, (Object)Blocks.ANVIL)) break;
                    v12 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7092(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16809);
                    Intrinsics.checkExpressionValueIsNotNull((Object)v12, (String)"ntAnvil");
                    if (!v12.Method365()) break;
lbl49:
                    // 5 sources

                    v13 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7087(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16809);
                    Intrinsics.checkExpressionValueIsNotNull((Object)v13, (String)"ntReplacePacket");
                    if (v13.Method365()) {
                        gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7080().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(((CPacketPlayerTryUseItemOnBlock)var2_2).hand));
                    }
                    var1_1.Method158();
                    break;
                }
            }
        }
        if (var2_2 instanceof CPacketUseEntity) {
            v14 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7093(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16809);
            Intrinsics.checkExpressionValueIsNotNull((Object)v14, (String)"noFriendDamage");
            if (v14.Method365() && (var3_3 = ((CPacketUseEntity)var2_2).getEntityFromWorld((World)gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7080().world)) instanceof EntityPlayer && n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI.Field11086.Method3043(((EntityPlayer)var3_3).getName())) {
                var1_1.Method158();
                return;
            }
        }
        if (var2_2 instanceof CPacketPlayerTryUseItemOnBlock == false) return;
        v15 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7094(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Field16809);
        Intrinsics.checkExpressionValueIsNotNull((Object)v15, (String)"roofInteract");
        if (v15.Method365() == false) return;
        v16 = ((CPacketPlayerTryUseItemOnBlock)var2_2).getPos();
        Intrinsics.checkExpressionValueIsNotNull((Object)v16, (String)"packet.pos");
        if (v16.getY() < (int)((long)-1347884733 ^ (long)-1347884612)) return;
        if (((CPacketPlayerTryUseItemOnBlock)var2_2).getDirection() != EnumFacing.UP) return;
        gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7080().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(((CPacketPlayerTryUseItemOnBlock)var2_2).getPos(), EnumFacing.DOWN, ((CPacketPlayerTryUseItemOnBlock)var2_2).hand, ((CPacketPlayerTryUseItemOnBlock)var2_2).facingX, ((CPacketPlayerTryUseItemOnBlock)var2_2).facingY, ((CPacketPlayerTryUseItemOnBlock)var2_2).facingZ));
    }

    gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG() {
    }

    private static String Method3059(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)456682109 ^ (long)456682109);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)742946330 ^ (long)742946533);
            int n2 = (int)((long)566833039 ^ (long)566833112);
            cArray2[n] = (char)(cArray[n] ^ ((int)-920692121L ^ 0xC91F630E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

