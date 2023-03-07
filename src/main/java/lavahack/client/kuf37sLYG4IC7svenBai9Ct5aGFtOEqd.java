//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayerDigging
 *  net.minecraft.network.play.client.CPacketPlayerDigging$Action
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.ChunkPos
 */
package lavahack.client;

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.gIvxvpNAI6XugtMxK19p7peBbgdbr5DL;
import lavahack.client.ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.v5nASUgpMaWmez7Gb8hbxPSc89JtOlu7;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020\fH\u0002J\b\u0010+\u001a\u00020,H\u0002J\u0006\u0010-\u001a\u00020\u001fJ\b\u0010.\u001a\u00020/H\u0002J\u000e\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\fJ\u000e\u00102\u001a\u00020/2\u0006\u00103\u001a\u00020\u0003J\u0010\u00104\u001a\u00020\f2\u0006\u00105\u001a\u00020\u0003H\u0002J\u0018\u00106\u001a\u00020/2\u0006\u00107\u001a\u00020\u001f2\u0006\u00108\u001a\u000209H\u0002J\u000e\u0010:\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u0003J\u0006\u0010<\u001a\u00020\u000fJ\u0006\u0010=\u001a\u00020/J\u0018\u0010>\u001a\u00020/2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0006\u0010?\u001a\u00020/J\b\u0010@\u001a\u00020/H\u0002R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0015j\b\u0012\u0004\u0012\u00020\f`\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R*\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0015j\b\u0012\u0004\u0012\u00020\f`\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u0015j\b\u0012\u0004\u0012\u00020\u001d`\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R2\u0010 \u001a&\u0012\f\u0012\n \"*\u0004\u0018\u00010\u00030\u0003 \"*\u0012\u0012\f\u0012\n \"*\u0004\u0018\u00010\u00030\u0003\u0018\u00010!0!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2={"Lcom/kisman/cc/features/nocom/modules/tracker/TrackedPlayer;", "", "x", "", "z", "(II)V", "dimension", "getDimension", "()I", "setDimension", "(I)V", "estimatedCenter", "Lnet/minecraft/util/math/ChunkPos;", "failures", "isReadyToRequest", "", "isSpiraling", "()Z", "setSpiraling", "(Z)V", "lastReceivedChunks", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "lastRequestedChunks", "getLastRequestedChunks", "()Ljava/util/ArrayList;", "setLastRequestedChunks", "(Ljava/util/ArrayList;)V", "primaryChunks", "Lcom/kisman/cc/features/nocom/modules/tracker/TrackedChunk;", "progress", "", "renderDistance", "Ljava/util/function/Supplier;", "kotlin.jvm.PlatformType", "sinceLastRequest", "", "spiralX", "spiralZ", "successfulPolls", "average", "first", "second", "blockCoords", "Lnet/minecraft/util/math/BlockPos;", "getReport", "initChunksUsingCenter", "", "onCoordReceive", "pos", "onDimensionChange", "newDimension", "oppositeCorner", "index", "print", "message", "handler", "Lcom/kisman/cc/util/chat/cubic/AbstractChatMessage;", "processSpiral", "max", "requestChunk", "resetSpiral", "setBlockCoords", "update", "updateProgress", "kisman.cc"})
public final class kuf37sLYG4IC7svenBai9Ct5aGFtOEqd {
    private String Field12958 = "|";
    private Supplier Field12959;
    private ArrayList Field12960;
    @NotNull
    private ArrayList Field12961;
    private ArrayList Field12962;
    private int Field12963;
    private ChunkPos Field12964;
    private long Field12965;
    private boolean Field12966;
    private boolean Field12967;
    private int Field12968;
    private int Field12969;
    private int Field12970;
    private int Field12971;
    private String Field12972 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final ArrayList Method4498() {
        return this.Field12961;
    }

    public final void Method4499(@NotNull @NotNull ArrayList arrayList) {
        Intrinsics.checkParameterIsNotNull((Object)arrayList, (String)"<set-?>");
        this.Field12961 = arrayList;
    }

    public final int Method4500() {
        return this.Field12963;
    }

    public final void Method4501(int n) {
        this.Field12963 = n;
    }

    public final boolean Method4502() {
        return this.Field12967;
    }

    public final void Method4503(boolean bl) {
        this.Field12967 = bl;
    }

    public final void Method4504() {
        int n;
        switch (this.Field12962.size()) {
            case 0: {
                n = this.Field12968;
                this.Field12968 = n + ((int)-1000673131L ^ 0xC45AF094);
                ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0 ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Field10121.Method7551();
                if (ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02 == null) {
                    Intrinsics.throwNpe();
                }
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02.Method2321();
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"NoComTrackerModule.instance!!.debugErrors");
                if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
                    String string = "Received 0 primary chunks, did we lose them? failures: " + this.Field12968;
                    gIvxvpNAI6XugtMxK19p7peBbgdbr5DL gIvxvpNAI6XugtMxK19p7peBbgdbr5DL2 = NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5504();
                    Intrinsics.checkExpressionValueIsNotNull((Object)gIvxvpNAI6XugtMxK19p7peBbgdbr5DL2, (String)"ChatUtility.error()");
                    this.Method4516(string, gIvxvpNAI6XugtMxK19p7peBbgdbr5DL2);
                }
                ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0 ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG03 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Field10121.Method7551();
                if (ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG03 == null) {
                    Intrinsics.throwNpe();
                }
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG03.Method2322();
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"NoComTrackerModule.instance!!.notify");
                if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365()) {
                    gIvxvpNAI6XugtMxK19p7peBbgdbr5DL gIvxvpNAI6XugtMxK19p7peBbgdbr5DL3 = NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5507();
                    Intrinsics.checkExpressionValueIsNotNull((Object)gIvxvpNAI6XugtMxK19p7peBbgdbr5DL3, (String)"ChatUtility.warning()");
                    this.Method4516("Tracker list target.", gIvxvpNAI6XugtMxK19p7peBbgdbr5DL3);
                }
                ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0 ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG04 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Field10121.Method7551();
                if (ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG04 == null) {
                    Intrinsics.throwNpe();
                }
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG04.Method2317();
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"NoComTrackerModule.instance!!.x");
                int n2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method335();
                int n3 = (int)((long)-1698631963 ^ (long)-1698631963);
                ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0 ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG05 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Field10121.Method7551();
                if (ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG05 == null) {
                    Intrinsics.throwNpe();
                }
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG05.Method2318();
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"NoComTrackerModule.instance!!.z");
                this.Field12964 = new ChunkPos(new BlockPos(n2, n3, qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method335()));
                break;
            }
            case 1: {
                this.Field12964 = (ChunkPos)this.Field12962.get((int)((long)-1631733123 ^ (long)-1631733123));
                this.Field12968 = (int)416129154L ^ 0x18CDA082;
                break;
            }
            case 2: {
                if (((ChunkPos)this.Field12962.get((int)((int)((long)1270677599 ^ (long)1270677599)))).x != ((ChunkPos)this.Field12962.get((int)((int)2075984003L ^ 0x7BBD0082))).x && ((ChunkPos)this.Field12962.get((int)((int)1960208279L ^ 0x74D66797))).z != ((ChunkPos)this.Field12962.get((int)((int)912384640L ^ 0x3661E281))).z) {
                    ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0 ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG06 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Field10121.Method7551();
                    if (ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG06 == null) {
                        Intrinsics.throwNpe();
                    }
                    qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG06.Method2321();
                    Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"NoComTrackerModule.instance!!.debugErrors");
                    if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6.Method365()) {
                        gIvxvpNAI6XugtMxK19p7peBbgdbr5DL gIvxvpNAI6XugtMxK19p7peBbgdbr5DL4 = NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5504();
                        Intrinsics.checkExpressionValueIsNotNull((Object)gIvxvpNAI6XugtMxK19p7peBbgdbr5DL4, (String)"ChatUtility.error()");
                        this.Method4516("Received 2 chunks that not on line. Is this split?", gIvxvpNAI6XugtMxK19p7peBbgdbr5DL4);
                    }
                }
                Object e = this.Field12962.get((int)390736459L ^ 0x174A2A4B);
                Intrinsics.checkExpressionValueIsNotNull(e, (String)"lastReceivedChunks[0]");
                ChunkPos chunkPos = (ChunkPos)e;
                Object e2 = this.Field12962.get((int)((long)-1472402815 ^ (long)-1472402816));
                Intrinsics.checkExpressionValueIsNotNull(e2, (String)"lastReceivedChunks[1]");
                this.Field12964 = this.Method4513(chunkPos, (ChunkPos)e2);
                this.Field12968 = (int)((long)507154518 ^ (long)507154518);
                break;
            }
            case 3: {
                n = (int)((long)1087406775 ^ (long)1087406775);
                int n4 = (int)-1304827684L ^ 0xB239E8DC;
                int n5 = (int)-1794734387L ^ 0x950686CE;
                int n6 = (int)-1992659338L ^ 0x893A6E76;
                for (ChunkPos chunkPos : this.Field12962) {
                    if (!Intrinsics.areEqual((Object)((v5nASUgpMaWmez7Gb8hbxPSc89JtOlu7)this.Field12960.get(n4)).Method6989(), (Object)chunkPos)) continue;
                    n6 = (int)((long)1874473853 ^ (long)1874473852);
                    break;
                }
                this.Field12964 = this.Method4512(n);
                this.Field12968 = (int)((long)8349258 ^ (long)8349258);
                break;
            }
            case 4: {
                this.Field12968 = (int)((long)-453381152 ^ (long)-453381152);
                break;
            }
        }
        this.Method4515();
        ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0 ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG07 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Field10121.Method7551();
        if (ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG07 == null) {
            Intrinsics.throwNpe();
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG07.Method2317();
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7, (String)"NoComTrackerModule.instance!!.x");
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7.Method370(this.Method4511().getX());
        ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0 ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG08 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Field10121.Method7551();
        if (ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG08 == null) {
            Intrinsics.throwNpe();
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG08.Method2318();
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8, (String)"NoComTrackerModule.instance!!.z");
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8.Method370(this.Method4511().getZ());
        this.Field12962.clear();
        this.Method4510();
        if (this.Field12968 == 0) {
            n = this.Field12969;
            this.Field12969 = n + ((int)1716653053L ^ 0x66520BFC);
        } else {
            ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0 ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG09 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Field10121.Method7551();
            if (ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG09 == null) {
                Intrinsics.throwNpe();
            }
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG09.Method2324();
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9, (String)"NoComTrackerModule.instance!!.autoSpiral");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9.Method365()) {
                double d = this.Field12968;
                ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0 ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG010 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Field10121.Method7551();
                if (ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG010 == null) {
                    Intrinsics.throwNpe();
                }
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG010.Method2325();
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10, (String)"NoComTrackerModule.instance!!.spiralTrigger");
                if (d > qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10.Method367()) {
                    this.Field12967 = (int)((long)-1592659091 ^ (long)-1592659092);
                    ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0 ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG011 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Field10121.Method7551();
                    if (ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG011 == null) {
                        Intrinsics.throwNpe();
                    }
                    qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG011.Method2321();
                    Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11, (String)"NoComTrackerModule.instance!!.debugErrors");
                    if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11.Method365()) {
                        gIvxvpNAI6XugtMxK19p7peBbgdbr5DL gIvxvpNAI6XugtMxK19p7peBbgdbr5DL5 = NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5507();
                        Intrinsics.checkExpressionValueIsNotNull((Object)gIvxvpNAI6XugtMxK19p7peBbgdbr5DL5, (String)"ChatUtility.warning()");
                        this.Method4516("Enabling Spiral Scanner", gIvxvpNAI6XugtMxK19p7peBbgdbr5DL5);
                    }
                }
            }
        }
        this.Field12966 = (int)((long)-1661881138 ^ (long)-1661881137);
    }

    public final void Method4505(int n) {
        if (this.Field12963 == n) {
            return;
        }
        BlockPos blockPos = this.Method4511();
        int n2 = blockPos.getX();
        int n3 = blockPos.getZ();
        if (n == ((int)-89983351L ^ 0x55D0976)) {
            n2 /= (int)((long)444721384 ^ (long)444721385) << 3;
            n3 /= ((int)1723384752L ^ 0x66B8C3B1) << 3;
            ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0 ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Field10121.Method7551();
            if (ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02 == null) {
                Intrinsics.throwNpe();
            }
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02.Method2320();
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"NoComTrackerModule.instance!!.debug");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
                gIvxvpNAI6XugtMxK19p7peBbgdbr5DL gIvxvpNAI6XugtMxK19p7peBbgdbr5DL2 = NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5507();
                Intrinsics.checkExpressionValueIsNotNull((Object)gIvxvpNAI6XugtMxK19p7peBbgdbr5DL2, (String)"ChatUtility.warning()");
                this.Method4516("Dimension has been changed to nether.", gIvxvpNAI6XugtMxK19p7peBbgdbr5DL2);
            }
        } else {
            n2 *= ((int)1289202480L ^ 0x4CD7AB31) << 3;
            n3 *= ((int)-1266461733L ^ 0xB48353DA) << 3;
            ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0 ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG03 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Field10121.Method7551();
            if (ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG03 == null) {
                Intrinsics.throwNpe();
            }
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG03.Method2320();
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"NoComTrackerModule.instance!!.debug");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365()) {
                String string = "Dimension has been changed to " + (n == 0 ? "overworld" : "end") + (((int)254310824L ^ 0xF2879BF) << 1);
                gIvxvpNAI6XugtMxK19p7peBbgdbr5DL gIvxvpNAI6XugtMxK19p7peBbgdbr5DL3 = NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5507();
                Intrinsics.checkExpressionValueIsNotNull((Object)gIvxvpNAI6XugtMxK19p7peBbgdbr5DL3, (String)"ChatUtility.warning()");
                this.Method4516(string, gIvxvpNAI6XugtMxK19p7peBbgdbr5DL3);
            }
        }
        this.Field12963 = n;
        if (this.Field12967) {
            this.Method4509();
        }
        this.Method4514(n2, n3);
        this.Field12966 = (int)((long)1224202606 ^ (long)1224202607);
    }

    public final boolean Method4506(int n) {
        int n2;
        ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0 ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Field10121.Method7551();
        if (ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02 == null) {
            Intrinsics.throwNpe();
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02.Method2327();
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"NoComTrackerModule.instance!!.spiralChunkStep");
        int n3 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method335() * ((int)((long)-1587982411 ^ (long)-1587982412) << 4);
        int n4 = (int)-1207313272L ^ 0xB809DC88;
        ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0 ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG03 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Field10121.Method7551();
        if (ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG03 == null) {
            Intrinsics.throwNpe();
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG03.Method2326();
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"NoComTrackerModule.instance!!.spiralPPT");
        int n5 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method335();
        if (n4 <= n5) {
            while (true) {
                int n6 = this.Field12970 + this.Method4511().getX();
                int n7 = this.Field12971 + this.Method4511().getZ();
                BlockPos blockPos = new BlockPos(n6, (int)((long)487875325 ^ (long)487875325), n7);
                Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.ABORT_DESTROY_BLOCK, blockPos, EnumFacing.UP));
                this.Field12961.add(new ChunkPos(blockPos));
                int n8 = this.Field12970;
                int n9 = (int)1366333713L ^ 0x51709911;
                int n10 = Math.abs(n8);
                n8 = this.Field12971;
                int n11 = n10;
                n9 = (int)-1857865568L ^ 0x914338A0;
                int n12 = Math.abs(n8);
                if (n11 <= n12 && (this.Field12970 != this.Field12971 || this.Field12970 >= 0)) {
                    this.Field12970 += this.Field12971 >= 0 ? n3 : -n3;
                } else {
                    this.Field12971 += this.Field12970 >= 0 ? -n3 : n3;
                }
                if (n4 == n5) break;
                ++n4;
            }
        }
        if (this.Field12970 < n) {
            n2 = (int)((long)242533704 ^ (long)242533705);
            return n2 != 0;
        }
        n2 = (int)((long)1040817092 ^ (long)1040817092);
        return n2 != 0;
    }

    public final void Method4507(@NotNull @NotNull ChunkPos chunkPos) {
        Intrinsics.checkParameterIsNotNull((Object)chunkPos, (String)"pos");
        this.Field12962.add(chunkPos);
        this.Field12961.remove(chunkPos);
        if (!this.Field12967) return;
        ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0 ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Field10121.Method7551();
        if (ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02 == null) {
            Intrinsics.throwNpe();
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02.Method2320();
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"NoComTrackerModule.instance!!.debug");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            gIvxvpNAI6XugtMxK19p7peBbgdbr5DL gIvxvpNAI6XugtMxK19p7peBbgdbr5DL2 = NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5503();
            Intrinsics.checkExpressionValueIsNotNull((Object)gIvxvpNAI6XugtMxK19p7peBbgdbr5DL2, (String)"ChatUtility.complete()");
            this.Method4516("Spiral found target. Tracking...", gIvxvpNAI6XugtMxK19p7peBbgdbr5DL2);
        }
        this.Method4509();
        this.Method4504();
    }

    public final boolean Method4508() {
        double d = System.currentTimeMillis() - this.Field12965;
        ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0 ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Field10121.Method7551();
        if (ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02 == null) {
            Intrinsics.throwNpe();
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02.Method2319();
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"NoComTrackerModule.instance!!.timeOut");
        if (d > qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method367()) {
            this.Field12966 = (int)((long)-876898510 ^ (long)-876898509);
        }
        if (!this.Field12966) {
            return (int)((long)-395714348 ^ (long)-395714348) != 0;
        }
        this.Field12961.clear();
        Iterator iterator = this.Field12960.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.Field12966 = (int)((long)1400966112 ^ (long)1400966112);
                this.Field12965 = System.currentTimeMillis();
                return (int)((long)78176778 ^ (long)78176779) != 0;
            }
            v5nASUgpMaWmez7Gb8hbxPSc89JtOlu7 v5nASUgpMaWmez7Gb8hbxPSc89JtOlu72 = (v5nASUgpMaWmez7Gb8hbxPSc89JtOlu7)iterator.next();
            ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0 ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG03 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Field10121.Method7551();
            if (ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG03 == null) {
                Intrinsics.throwNpe();
            }
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG03.Method2320();
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"NoComTrackerModule.instance!!.debug");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365()) {
                gIvxvpNAI6XugtMxK19p7peBbgdbr5DL gIvxvpNAI6XugtMxK19p7peBbgdbr5DL2 = NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5507();
                Intrinsics.checkExpressionValueIsNotNull((Object)gIvxvpNAI6XugtMxK19p7peBbgdbr5DL2, (String)"ChatUtility.warning()");
                this.Method4516("REQUESTING CHUNKS...", gIvxvpNAI6XugtMxK19p7peBbgdbr5DL2);
            }
            Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.ABORT_DESTROY_BLOCK, v5nASUgpMaWmez7Gb8hbxPSc89JtOlu72.Method6990(), EnumFacing.UP));
            this.Field12961.add(v5nASUgpMaWmez7Gb8hbxPSc89JtOlu72.Method6989());
        }
    }

    public final void Method4509() {
        this.Field12967 = (int)((long)1149470901 ^ (long)1149470901);
        this.Field12970 = (int)((long)1394925222 ^ (long)1394925222);
        this.Field12971 = (int)((long)-1336380801 ^ (long)-1336380801);
        this.Field12961.clear();
    }

    private final void Method4510() {
        if (this.Field12968 > 0) {
            this.Field12958 = "" + (char)((int)-1030041458L ^ 0xC29AD0AF) + this.Field12968 + (char)((int)-1970601504L ^ 0x8A8B01C1);
        } else if (StringsKt.contains$default((CharSequence)this.Field12958, (CharSequence)"!", ((int)-2089773144L ^ 0x837097A8) != 0, (int)(((int)-378846071L ^ 0xE96B4488) << 1), null)) {
            this.Field12958 = "|";
        }
        switch (this.Field12958) {
            case "|": {
                this.Field12958 = "/";
                return;
            }
            case "/": {
                this.Field12958 = "-";
                return;
            }
            case "-": {
                this.Field12958 = "\\";
                return;
            }
            case "\\": {
                this.Field12958 = "|";
                return;
            }
        }
    }

    private final BlockPos Method4511() {
        ChunkPos chunkPos = this.Field12964;
        if (chunkPos == null) {
            Intrinsics.throwNpe();
        }
        BlockPos blockPos = chunkPos.getBlock((int)((long)-1621152253 ^ (long)-1621152253), (int)-533596807L ^ 0xE031F579, (int)-1252925677L ^ 0xB551DF13);
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos, (String)"estimatedCenter!!.getBlock(0, 0, 0)");
        return blockPos;
    }

    private final ChunkPos Method4512(int n) {
        ChunkPos chunkPos;
        switch (n) {
            case 0: {
                chunkPos = ((v5nASUgpMaWmez7Gb8hbxPSc89JtOlu7)this.Field12960.get((int)((long)758961889 ^ (long)758961890))).Method6989();
                return chunkPos;
            }
            case 1: {
                chunkPos = ((v5nASUgpMaWmez7Gb8hbxPSc89JtOlu7)this.Field12960.get((int)((long)700116241 ^ (long)700116240) << 1)).Method6989();
                return chunkPos;
            }
            case 2: {
                chunkPos = ((v5nASUgpMaWmez7Gb8hbxPSc89JtOlu7)this.Field12960.get((int)((long)-996485380 ^ (long)-996485379))).Method6989();
                return chunkPos;
            }
            case 3: {
                chunkPos = ((v5nASUgpMaWmez7Gb8hbxPSc89JtOlu7)this.Field12960.get((int)((long)-817581779 ^ (long)-817581779))).Method6989();
                return chunkPos;
            }
        }
        ChunkPos chunkPos2 = this.Field12964;
        chunkPos = chunkPos2;
        if (chunkPos2 != null) return chunkPos;
        Intrinsics.throwNpe();
        return chunkPos;
    }

    private final ChunkPos Method4513(ChunkPos chunkPos, ChunkPos chunkPos2) {
        return new ChunkPos((chunkPos.x + chunkPos2.x) / ((int)((long)-1475094775 ^ (long)-1475094776) << 1), (chunkPos.x + chunkPos2.x) / ((int)((long)-1297829177 ^ (long)-1297829178) << 1));
    }

    private final void Method4514(int n, int n2) {
        ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0 ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Field10121.Method7551();
        if (ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02 == null) {
            Intrinsics.throwNpe();
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02.Method2317();
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"NoComTrackerModule.instance!!.x");
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method370(n);
        ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0 ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG03 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Field10121.Method7551();
        if (ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG03 == null) {
            Intrinsics.throwNpe();
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG03.Method2318();
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"NoComTrackerModule.instance!!.z");
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method370(n2);
        this.Field12964 = new ChunkPos(new BlockPos(n, (int)((long)-646722829 ^ (long)-646722829), n2));
    }

    private final void Method4515() {
        int n = (int)-33802499L ^ 0xFDFC36FD;
        int n2 = (int)-499002670L ^ 0xE241D2D1;
        while (true) {
            ChunkPos chunkPos = this.Field12964;
            if (chunkPos == null) {
                Intrinsics.throwNpe();
            }
            int n3 = chunkPos.x;
            ChunkPos chunkPos2 = this.Field12964;
            if (chunkPos2 == null) {
                Intrinsics.throwNpe();
            }
            int n4 = chunkPos2.z;
            Object t = this.Field12959.get();
            Intrinsics.checkExpressionValueIsNotNull(t, (String)"renderDistance.get()");
            Object t2 = this.Field12959.get();
            Intrinsics.checkExpressionValueIsNotNull(t2, (String)"renderDistance.get()");
            this.Field12960.set(n, new v5nASUgpMaWmez7Gb8hbxPSc89JtOlu7(n3 -= ((Number)t).intValue(), n4 -= ((Number)t2).intValue()));
            ++n;
        }
    }

    private final void Method4516(String string, gIvxvpNAI6XugtMxK19p7peBbgdbr5DL gIvxvpNAI6XugtMxK19p7peBbgdbr5DL2) {
        ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0 ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Field10121.Method7551();
        if (ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02 == null) {
            Intrinsics.throwNpe();
        }
        ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02.Method2328(string, gIvxvpNAI6XugtMxK19p7peBbgdbr5DL2);
    }

    @NotNull
    @NotNull
    public final String Method4517() {
        String string;
        StringBuilder stringBuilder = new StringBuilder().append("Last reported coordinates: ");
        switch (this.Field12963) {
            case 0: {
                string = this.Method4511().getX() + ", " + this.Method4511().getZ() + " in dimension overworld / " + this.Method4511().getX() / ((int)((long)-1388679199 ^ (long)-1388679200) << 3) + ", " + this.Method4511().getZ() / ((int)((long)1288369111 ^ (long)1288369110) << 3) + " in dimension nether";
                return stringBuilder.append(string).append("\n Successful polls: ").append(this.Field12969).append(" / failures before disabling module: ").append(this.Field12968).toString();
            }
            case 1: {
                string = this.Method4511().getX() + ", " + this.Method4511().getZ() + " in dimension end";
                return stringBuilder.append(string).append("\n Successful polls: ").append(this.Field12969).append(" / failures before disabling module: ").append(this.Field12968).toString();
            }
            case -1: {
                string = this.Method4511().getX() + ", " + this.Method4511().getZ() + " in dimension nether / " + this.Method4511().getX() * (((int)1611221733L ^ 0x60094AE4) << 3) + ", " + this.Method4511().getZ() * (((int)-68876988L ^ 0xFBE50545) << 3) + " in dimension overworld";
                return stringBuilder.append(string).append("\n Successful polls: ").append(this.Field12969).append(" / failures before disabling module: ").append(this.Field12968).toString();
            }
        }
        string = "kill yourself with love <3";
        return stringBuilder.append(string).append("\n Successful polls: ").append(this.Field12969).append(" / failures before disabling module: ").append(this.Field12968).toString();
    }

    public kuf37sLYG4IC7svenBai9Ct5aGFtOEqd(int n, int n2) {
        ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0 ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG0.Field10121.Method7551();
        if (ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02 == null) {
            Intrinsics.throwNpe();
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = ghSZKRHmOFsUArQvfcXaJNGgFBtZnxG02.Method2323();
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"NoComTrackerModule.instance!!.renderDistance");
        this.Field12959 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method392();
        this.Field12960 = new ArrayList((int)((long)1854785879 ^ (long)1854785878) << 2);
        this.Field12961 = new ArrayList();
        this.Field12962 = new ArrayList();
        this.Field12963 = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.dimension;
        this.Field12965 = System.currentTimeMillis();
        this.Field12966 = (int)((long)-1674502439 ^ (long)-1674502440);
        this.Method4514(n, n2);
        this.Method4515();
    }

    private static String Method4518(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1569678165 ^ (long)1569678165);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)35183829 ^ (long)35183658);
            int n2 = (int)((long)2094000516 ^ (long)2094000585);
            cArray2[n] = (char)(cArray[n] ^ (((int)1535028480L ^ 0x5B7E994B) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

