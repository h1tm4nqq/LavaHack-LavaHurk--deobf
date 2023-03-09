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

import com.kisman.cc.util.Class2142;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lavahack.client.Class1393;
import lavahack.client.Class1740;
import lavahack.client.Class1884;
import lavahack.client.Class44;
import lavahack.client.Class504;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020\fH\u0002J\b\u0010+\u001a\u00020,H\u0002J\u0006\u0010-\u001a\u00020\u001fJ\b\u0010.\u001a\u00020/H\u0002J\u000e\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\fJ\u000e\u00102\u001a\u00020/2\u0006\u00103\u001a\u00020\u0003J\u0010\u00104\u001a\u00020\f2\u0006\u00105\u001a\u00020\u0003H\u0002J\u0018\u00106\u001a\u00020/2\u0006\u00107\u001a\u00020\u001f2\u0006\u00108\u001a\u000209H\u0002J\u000e\u0010:\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u0003J\u0006\u0010<\u001a\u00020\u000fJ\u0006\u0010=\u001a\u00020/J\u0018\u0010>\u001a\u00020/2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0006\u0010?\u001a\u00020/J\b\u0010@\u001a\u00020/H\u0002R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0015j\b\u0012\u0004\u0012\u00020\f`\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R*\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0015j\b\u0012\u0004\u0012\u00020\f`\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u0015j\b\u0012\u0004\u0012\u00020\u001d`\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R2\u0010 \u001a&\u0012\f\u0012\n \"*\u0004\u0018\u00010\u00030\u0003 \"*\u0012\u0012\f\u0012\n \"*\u0004\u0018\u00010\u00030\u0003\u0018\u00010!0!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2={"Lcom/kisman/cc/features/nocom/modules/tracker/TrackedPlayer;", "", "x", "", "z", "(II)V", "dimension", "getDimension", "()I", "setDimension", "(I)V", "estimatedCenter", "Lnet/minecraft/util/math/ChunkPos;", "failures", "isReadyToRequest", "", "isSpiraling", "()Z", "setSpiraling", "(Z)V", "lastReceivedChunks", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "lastRequestedChunks", "getLastRequestedChunks", "()Ljava/util/ArrayList;", "setLastRequestedChunks", "(Ljava/util/ArrayList;)V", "primaryChunks", "Lcom/kisman/cc/features/nocom/modules/tracker/TrackedChunk;", "progress", "", "renderDistance", "Ljava/util/function/Supplier;", "kotlin.jvm.PlatformType", "sinceLastRequest", "", "spiralX", "spiralZ", "successfulPolls", "average", "first", "second", "blockCoords", "Lnet/minecraft/util/math/BlockPos;", "getReport", "initChunksUsingCenter", "", "onCoordReceive", "pos", "onDimensionChange", "newDimension", "oppositeCorner", "index", "print", "message", "handler", "Lcom/kisman/cc/util/chat/cubic/AbstractChatMessage;", "processSpiral", "max", "requestChunk", "resetSpiral", "setBlockCoords", "update", "updateProgress", "kisman.cc"})
public final class Class1101 {
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
                this.Field12968 = n + 1;
                Class504 class504 = Class504.Field10121.Method7551();
                if (class504 == null) {
                    Intrinsics.throwNpe();
                }
                Class44 class44 = class504.Method2321();
                Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"NoComTrackerModule.instance!!.debugErrors");
                if (class44.Method365()) {
                    String string = "Received 0 primary chunks, did we lose them? failures: " + this.Field12968;
                    Class1740 class1740 = Class1393.Method5504();
                    Intrinsics.checkExpressionValueIsNotNull((Object)class1740, (String)"ChatUtility.error()");
                    this.Method4516(string, class1740);
                }
                Class504 class5042 = Class504.Field10121.Method7551();
                if (class5042 == null) {
                    Intrinsics.throwNpe();
                }
                Class44 class442 = class5042.Method2322();
                Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"NoComTrackerModule.instance!!.notify");
                if (class442.Method365()) {
                    Class1740 class1740 = Class1393.Method5507();
                    Intrinsics.checkExpressionValueIsNotNull((Object)class1740, (String)"ChatUtility.warning()");
                    this.Method4516("Tracker list target.", class1740);
                }
                Class504 class5043 = Class504.Field10121.Method7551();
                if (class5043 == null) {
                    Intrinsics.throwNpe();
                }
                Class44 class443 = class5043.Method2317();
                Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"NoComTrackerModule.instance!!.x");
                int n2 = class443.Method335();
                Class504 class5044 = Class504.Field10121.Method7551();
                if (class5044 == null) {
                    Intrinsics.throwNpe();
                }
                Class44 class444 = class5044.Method2318();
                Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"NoComTrackerModule.instance!!.z");
                this.Field12964 = new ChunkPos(new BlockPos(n2, 0, class444.Method335()));
                break;
            }
            case 1: {
                this.Field12964 = (ChunkPos)this.Field12962.get(0);
                this.Field12968 = 0;
                break;
            }
            case 2: {
                if (((ChunkPos)this.Field12962.get((int)0)).x != ((ChunkPos)this.Field12962.get((int)1)).x && ((ChunkPos)this.Field12962.get((int)0)).z != ((ChunkPos)this.Field12962.get((int)1)).z) {
                    Class504 class504 = Class504.Field10121.Method7551();
                    if (class504 == null) {
                        Intrinsics.throwNpe();
                    }
                    Class44 class44 = class504.Method2321();
                    Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"NoComTrackerModule.instance!!.debugErrors");
                    if (class44.Method365()) {
                        Class1740 class1740 = Class1393.Method5504();
                        Intrinsics.checkExpressionValueIsNotNull((Object)class1740, (String)"ChatUtility.error()");
                        this.Method4516("Received 2 chunks that not on line. Is this split?", class1740);
                    }
                }
                Object e = this.Field12962.get(0);
                Intrinsics.checkExpressionValueIsNotNull(e, (String)"lastReceivedChunks[0]");
                ChunkPos chunkPos = (ChunkPos)e;
                Object e2 = this.Field12962.get(1);
                Intrinsics.checkExpressionValueIsNotNull(e2, (String)"lastReceivedChunks[1]");
                this.Field12964 = this.Method4513(chunkPos, (ChunkPos)e2);
                this.Field12968 = 0;
                break;
            }
            case 3: {
                n = 0;
                int n3 = 0;
                int n4 = 3;
                boolean bl = false;
                for (ChunkPos chunkPos : this.Field12962) {
                    if (!Intrinsics.areEqual((Object)((Class1884)this.Field12960.get(n3)).Method6989(), (Object)chunkPos)) continue;
                    bl = true;
                    break;
                }
                this.Field12964 = this.Method4512(n);
                this.Field12968 = 0;
                break;
            }
            case 4: {
                this.Field12968 = 0;
                break;
            }
        }
        this.Method4515();
        Class504 class504 = Class504.Field10121.Method7551();
        if (class504 == null) {
            Intrinsics.throwNpe();
        }
        Class44 class44 = class504.Method2317();
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"NoComTrackerModule.instance!!.x");
        class44.Method370(this.Method4511().getX());
        Class504 class5045 = Class504.Field10121.Method7551();
        if (class5045 == null) {
            Intrinsics.throwNpe();
        }
        Class44 class445 = class5045.Method2318();
        Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"NoComTrackerModule.instance!!.z");
        class445.Method370(this.Method4511().getZ());
        this.Field12962.clear();
        this.Method4510();
        if (this.Field12968 == 0) {
            n = this.Field12969;
            this.Field12969 = n + 1;
        } else {
            Class504 class5046 = Class504.Field10121.Method7551();
            if (class5046 == null) {
                Intrinsics.throwNpe();
            }
            Class44 class446 = class5046.Method2324();
            Intrinsics.checkExpressionValueIsNotNull((Object)class446, (String)"NoComTrackerModule.instance!!.autoSpiral");
            if (class446.Method365()) {
                double d = this.Field12968;
                Class504 class5047 = Class504.Field10121.Method7551();
                if (class5047 == null) {
                    Intrinsics.throwNpe();
                }
                Class44 class447 = class5047.Method2325();
                Intrinsics.checkExpressionValueIsNotNull((Object)class447, (String)"NoComTrackerModule.instance!!.spiralTrigger");
                if (d > class447.Method367()) {
                    this.Field12967 = true;
                    Class504 class5048 = Class504.Field10121.Method7551();
                    if (class5048 == null) {
                        Intrinsics.throwNpe();
                    }
                    Class44 class448 = class5048.Method2321();
                    Intrinsics.checkExpressionValueIsNotNull((Object)class448, (String)"NoComTrackerModule.instance!!.debugErrors");
                    if (class448.Method365()) {
                        Class1740 class1740 = Class1393.Method5507();
                        Intrinsics.checkExpressionValueIsNotNull((Object)class1740, (String)"ChatUtility.warning()");
                        this.Method4516("Enabling Spiral Scanner", class1740);
                    }
                }
            }
        }
        this.Field12966 = true;
    }

    public final void Method4505(int n) {
        if (this.Field12963 == n) {
            return;
        }
        BlockPos blockPos = this.Method4511();
        int n2 = blockPos.getX();
        int n3 = blockPos.getZ();
        if (n == -1) {
            n2 /= 8;
            n3 /= 8;
            Class504 class504 = Class504.Field10121.Method7551();
            if (class504 == null) {
                Intrinsics.throwNpe();
            }
            Class44 class44 = class504.Method2320();
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"NoComTrackerModule.instance!!.debug");
            if (class44.Method365()) {
                Class1740 class1740 = Class1393.Method5507();
                Intrinsics.checkExpressionValueIsNotNull((Object)class1740, (String)"ChatUtility.warning()");
                this.Method4516("Dimension has been changed to nether.", class1740);
            }
        } else {
            n2 *= 8;
            n3 *= 8;
            Class504 class504 = Class504.Field10121.Method7551();
            if (class504 == null) {
                Intrinsics.throwNpe();
            }
            Class44 class44 = class504.Method2320();
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"NoComTrackerModule.instance!!.debug");
            if (class44.Method365()) {
                String string = "Dimension has been changed to " + (n == 0 ? "overworld" : "end") + '.';
                Class1740 class1740 = Class1393.Method5507();
                Intrinsics.checkExpressionValueIsNotNull((Object)class1740, (String)"ChatUtility.warning()");
                this.Method4516(string, class1740);
            }
        }
        this.Field12963 = n;
        if (this.Field12967) {
            this.Method4509();
        }
        this.Method4514(n2, n3);
        this.Field12966 = true;
    }

    public final boolean Method4506(int n) {
        Class504 class504 = Class504.Field10121.Method7551();
        if (class504 == null) {
            Intrinsics.throwNpe();
        }
        Class44 class44 = class504.Method2327();
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"NoComTrackerModule.instance!!.spiralChunkStep");
        int n2 = class44.Method335() * 16;
        int n3 = 0;
        Class504 class5042 = Class504.Field10121.Method7551();
        if (class5042 == null) {
            Intrinsics.throwNpe();
        }
        Class44 class442 = class5042.Method2326();
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"NoComTrackerModule.instance!!.spiralPPT");
        int n4 = class442.Method335();
        if (n3 <= n4) {
            while (true) {
                int n5 = this.Field12970 + this.Method4511().getX();
                int n6 = this.Field12971 + this.Method4511().getZ();
                BlockPos blockPos = new BlockPos(n5, 0, n6);
                Class2142.Field17803.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.ABORT_DESTROY_BLOCK, blockPos, EnumFacing.UP));
                this.Field12961.add(new ChunkPos(blockPos));
                int n7 = this.Field12970;
                boolean bl = false;
                int n8 = Math.abs(n7);
                n7 = this.Field12971;
                int n9 = n8;
                bl = false;
                int n10 = Math.abs(n7);
                if (n9 <= n10 && (this.Field12970 != this.Field12971 || this.Field12970 >= 0)) {
                    this.Field12970 += this.Field12971 >= 0 ? n2 : -n2;
                } else {
                    this.Field12971 += this.Field12970 >= 0 ? -n2 : n2;
                }
                if (n3 == n4) break;
                ++n3;
            }
        }
        if (this.Field12970 >= n) return false;
        return true;
    }

    public final void Method4507(@NotNull @NotNull ChunkPos chunkPos) {
        Intrinsics.checkParameterIsNotNull((Object)chunkPos, (String)"pos");
        this.Field12962.add(chunkPos);
        this.Field12961.remove(chunkPos);
        if (!this.Field12967) return;
        Class504 class504 = Class504.Field10121.Method7551();
        if (class504 == null) {
            Intrinsics.throwNpe();
        }
        Class44 class44 = class504.Method2320();
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"NoComTrackerModule.instance!!.debug");
        if (class44.Method365()) {
            Class1740 class1740 = Class1393.Method5503();
            Intrinsics.checkExpressionValueIsNotNull((Object)class1740, (String)"ChatUtility.complete()");
            this.Method4516("Spiral found target. Tracking...", class1740);
        }
        this.Method4509();
        this.Method4504();
    }

    public final boolean Method4508() {
        double d = System.currentTimeMillis() - this.Field12965;
        Class504 class504 = Class504.Field10121.Method7551();
        if (class504 == null) {
            Intrinsics.throwNpe();
        }
        Class44 class44 = class504.Method2319();
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"NoComTrackerModule.instance!!.timeOut");
        if (d > class44.Method367()) {
            this.Field12966 = true;
        }
        if (!this.Field12966) {
            return false;
        }
        this.Field12961.clear();
        Iterator iterator = this.Field12960.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.Field12966 = false;
                this.Field12965 = System.currentTimeMillis();
                return true;
            }
            Class1884 class1884 = (Class1884)iterator.next();
            Class504 class5042 = Class504.Field10121.Method7551();
            if (class5042 == null) {
                Intrinsics.throwNpe();
            }
            Class44 class442 = class5042.Method2320();
            Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"NoComTrackerModule.instance!!.debug");
            if (class442.Method365()) {
                Class1740 class1740 = Class1393.Method5507();
                Intrinsics.checkExpressionValueIsNotNull((Object)class1740, (String)"ChatUtility.warning()");
                this.Method4516("REQUESTING CHUNKS...", class1740);
            }
            Class2142.Field17803.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.ABORT_DESTROY_BLOCK, class1884.Method6990(), EnumFacing.UP));
            this.Field12961.add(class1884.Method6989());
        }
    }

    public final void Method4509() {
        this.Field12967 = false;
        this.Field12970 = 0;
        this.Field12971 = 0;
        this.Field12961.clear();
    }

    private final void Method4510() {
        if (this.Field12968 > 0) {
            this.Field12958 = "" + '!' + this.Field12968 + '!';
        } else if (StringsKt.contains$default((CharSequence)this.Field12958, (CharSequence)"!", (boolean)false, (int)2, null)) {
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
        BlockPos blockPos = chunkPos.getBlock(0, 0, 0);
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos, (String)"estimatedCenter!!.getBlock(0, 0, 0)");
        return blockPos;
    }

    private final ChunkPos Method4512(int n) {
        ChunkPos chunkPos;
        switch (n) {
            case 0: {
                chunkPos = ((Class1884)this.Field12960.get(3)).Method6989();
                return chunkPos;
            }
            case 1: {
                chunkPos = ((Class1884)this.Field12960.get(2)).Method6989();
                return chunkPos;
            }
            case 2: {
                chunkPos = ((Class1884)this.Field12960.get(1)).Method6989();
                return chunkPos;
            }
            case 3: {
                chunkPos = ((Class1884)this.Field12960.get(0)).Method6989();
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
        return new ChunkPos((chunkPos.x + chunkPos2.x) / 2, (chunkPos.x + chunkPos2.x) / 2);
    }

    private final void Method4514(int n, int n2) {
        Class504 class504 = Class504.Field10121.Method7551();
        if (class504 == null) {
            Intrinsics.throwNpe();
        }
        Class44 class44 = class504.Method2317();
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"NoComTrackerModule.instance!!.x");
        class44.Method370(n);
        Class504 class5042 = Class504.Field10121.Method7551();
        if (class5042 == null) {
            Intrinsics.throwNpe();
        }
        Class44 class442 = class5042.Method2318();
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"NoComTrackerModule.instance!!.z");
        class442.Method370(n2);
        this.Field12964 = new ChunkPos(new BlockPos(n, 0, n2));
    }

    private final void Method4515() {
        int n = 0;
        int n2 = 3;
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
            this.Field12960.set(n, new Class1884(n3 -= ((Number)t).intValue(), n4 -= ((Number)t2).intValue()));
            ++n;
        }
    }

    private final void Method4516(String string, Class1740 class1740) {
        Class504 class504 = Class504.Field10121.Method7551();
        if (class504 == null) {
            Intrinsics.throwNpe();
        }
        class504.Method2328(string, class1740);
    }

    @NotNull
    @NotNull
    public final String Method4517() {
        String string;
        StringBuilder stringBuilder = new StringBuilder().append("Last reported coordinates: ");
        switch (this.Field12963) {
            case 0: {
                string = this.Method4511().getX() + ", " + this.Method4511().getZ() + " in dimension overworld / " + this.Method4511().getX() / 8 + ", " + this.Method4511().getZ() / 8 + " in dimension nether";
                return stringBuilder.append(string).append("\n Successful polls: ").append(this.Field12969).append(" / failures before disabling module: ").append(this.Field12968).toString();
            }
            case 1: {
                string = this.Method4511().getX() + ", " + this.Method4511().getZ() + " in dimension end";
                return stringBuilder.append(string).append("\n Successful polls: ").append(this.Field12969).append(" / failures before disabling module: ").append(this.Field12968).toString();
            }
            case -1: {
                string = this.Method4511().getX() + ", " + this.Method4511().getZ() + " in dimension nether / " + this.Method4511().getX() * 8 + ", " + this.Method4511().getZ() * 8 + " in dimension overworld";
                return stringBuilder.append(string).append("\n Successful polls: ").append(this.Field12969).append(" / failures before disabling module: ").append(this.Field12968).toString();
            }
        }
        string = "kill yourself with love <3";
        return stringBuilder.append(string).append("\n Successful polls: ").append(this.Field12969).append(" / failures before disabling module: ").append(this.Field12968).toString();
    }

    public Class1101(int n, int n2) {
        Class504 class504 = Class504.Field10121.Method7551();
        if (class504 == null) {
            Intrinsics.throwNpe();
        }
        Class44 class44 = class504.Method2323();
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"NoComTrackerModule.instance!!.renderDistance");
        this.Field12959 = class44.Method392();
        this.Field12960 = new ArrayList(4);
        this.Field12961 = new ArrayList();
        this.Field12962 = new ArrayList();
        this.Field12963 = Class2142.Field17803.player.dimension;
        this.Field12965 = System.currentTimeMillis();
        this.Field12966 = true;
        this.Method4514(n, n2);
        this.Method4515();
    }

    private static String Method4518(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 77;
            cArray2[n] = (char)(cArray[n] ^ (0x6896 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

