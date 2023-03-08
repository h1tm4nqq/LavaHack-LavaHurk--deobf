//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import java.util.function.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.util.math.*;
import java.util.*;
import com.kisman.cc.util.*;
import net.minecraft.network.*;
import net.minecraft.util.*;
import net.minecraft.network.play.client.*;
import kotlin.text.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003?\u0006\u0002\u0010\u0005J\u0018\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020\fH\u0002J\b\u0010+\u001a\u00020,H\u0002J\u0006\u0010-\u001a\u00020\u001fJ\b\u0010.\u001a\u00020/H\u0002J\u000e\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\fJ\u000e\u00102\u001a\u00020/2\u0006\u00103\u001a\u00020\u0003J\u0010\u00104\u001a\u00020\f2\u0006\u00105\u001a\u00020\u0003H\u0002J\u0018\u00106\u001a\u00020/2\u0006\u00107\u001a\u00020\u001f2\u0006\u00108\u001a\u000209H\u0002J\u000e\u0010:\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u0003J\u0006\u0010<\u001a\u00020\u000fJ\u0006\u0010=\u001a\u00020/J\u0018\u0010>\u001a\u00020/2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0006\u0010?\u001a\u00020/J\b\u0010@\u001a\u00020/H\u0002R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e?\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u000fX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0015j\b\u0012\u0004\u0012\u00020\f`\u0016X\u0082\u000e?\u0006\u0002\n\u0000R*\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0015j\b\u0012\u0004\u0012\u00020\f`\u0016X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u0015j\b\u0012\u0004\u0012\u00020\u001d`\u0016X\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e?\u0006\u0002\n\u0000R2\u0010 \u001a&\u0012\f\u0012\n \"*\u0004\u0018\u00010\u00030\u0003 \"*\u0012\u0012\f\u0012\n \"*\u0004\u0018\u00010\u00030\u0003\u0018\u00010!0!X\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0003X\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0003X\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0003X\u0082\u000e?\u0006\u0002\n\u0000?\u0006A" }, d2 = { "Lcom/kisman/cc/features/nocom/modules/tracker/TrackedPlayer;", "", "x", "", "z", "(II)V", "dimension", "getDimension", "()I", "setDimension", "(I)V", "estimatedCenter", "Lnet/minecraft/util/math/ChunkPos;", "failures", "isReadyToRequest", "", "isSpiraling", "()Z", "setSpiraling", "(Z)V", "lastReceivedChunks", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "lastRequestedChunks", "getLastRequestedChunks", "()Ljava/util/ArrayList;", "setLastRequestedChunks", "(Ljava/util/ArrayList;)V", "primaryChunks", "Lcom/kisman/cc/features/nocom/modules/tracker/TrackedChunk;", "progress", "", "renderDistance", "Ljava/util/function/Supplier;", "kotlin.jvm.PlatformType", "sinceLastRequest", "", "spiralX", "spiralZ", "successfulPolls", "average", "first", "second", "blockCoords", "Lnet/minecraft/util/math/BlockPos;", "getReport", "initChunksUsingCenter", "", "onCoordReceive", "pos", "onDimensionChange", "newDimension", "oppositeCorner", "index", "print", "message", "handler", "Lcom/kisman/cc/util/chat/cubic/AbstractChatMessage;", "processSpiral", "max", "requestChunk", "resetSpiral", "setBlockCoords", "update", "updateProgress", "kisman.cc" })
public final class Class1101
{
    private String Field12958;
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
    
    public final void Method4499(@NotNull @NotNull final ArrayList field12961) {
        Intrinsics.checkParameterIsNotNull((Object)field12961, "<set-?>");
        this.Field12961 = field12961;
    }
    
    public final int Method4500() {
        return this.Field12963;
    }
    
    public final void Method4501(final int field12963) {
        this.Field12963 = field12963;
    }
    
    public final boolean Method4502() {
        return this.Field12967;
    }
    
    public final void Method4503(final boolean field12967) {
        this.Field12967 = field12967;
    }
    
    public final void Method4504() {
        switch (this.Field12962.size()) {
            case 0: {
                this.Field12968++;
                final Class504 method7551 = Class504.Field10121.Method7551();
                if (method7551 == null) {
                    Intrinsics.throwNpe();
                }
                final Class44 method7552 = method7551.Method2321();
                Intrinsics.checkExpressionValueIsNotNull((Object)method7552, "NoComTrackerModule.instance!!.debugErrors");
                if (method7552.Method365()) {
                    final String string = "Received 0 primary chunks, did we lose them? failures: " + this.Field12968;
                    final Class1740 method7553 = Class1393.Method5504();
                    Intrinsics.checkExpressionValueIsNotNull((Object)method7553, "ChatUtility.error()");
                    this.Method4516(string, method7553);
                }
                final Class504 method7554 = Class504.Field10121.Method7551();
                if (method7554 == null) {
                    Intrinsics.throwNpe();
                }
                final Class44 method7555 = method7554.Method2322();
                Intrinsics.checkExpressionValueIsNotNull((Object)method7555, "NoComTrackerModule.instance!!.notify");
                if (method7555.Method365()) {
                    final String s = "Tracker list target.";
                    final Class1740 method7556 = Class1393.Method5507();
                    Intrinsics.checkExpressionValueIsNotNull((Object)method7556, "ChatUtility.warning()");
                    this.Method4516(s, method7556);
                }
                final Class504 method7557 = Class504.Field10121.Method7551();
                if (method7557 == null) {
                    Intrinsics.throwNpe();
                }
                final Class44 method7558 = method7557.Method2317();
                Intrinsics.checkExpressionValueIsNotNull((Object)method7558, "NoComTrackerModule.instance!!.x");
                final int method7559 = method7558.Method335();
                final int n = 0;
                final Class504 method7560 = Class504.Field10121.Method7551();
                if (method7560 == null) {
                    Intrinsics.throwNpe();
                }
                final Class44 method7561 = method7560.Method2318();
                Intrinsics.checkExpressionValueIsNotNull((Object)method7561, "NoComTrackerModule.instance!!.z");
                this.Field12964 = new ChunkPos(new BlockPos(method7559, n, method7561.Method335()));
                break;
            }
            case 1: {
                this.Field12964 = this.Field12962.get(0);
                this.Field12968 = 0;
                break;
            }
            case 2: {
                if (this.Field12962.get(0).x != this.Field12962.get(1).x && this.Field12962.get(0).z != this.Field12962.get(1).z) {
                    final Class504 method7562 = Class504.Field10121.Method7551();
                    if (method7562 == null) {
                        Intrinsics.throwNpe();
                    }
                    final Class44 method7563 = method7562.Method2321();
                    Intrinsics.checkExpressionValueIsNotNull((Object)method7563, "NoComTrackerModule.instance!!.debugErrors");
                    if (method7563.Method365()) {
                        final String s2 = "Received 2 chunks that not on line. Is this split?";
                        final Class1740 method7564 = Class1393.Method5504();
                        Intrinsics.checkExpressionValueIsNotNull((Object)method7564, "ChatUtility.error()");
                        this.Method4516(s2, method7564);
                    }
                }
                final ChunkPos value = this.Field12962.get(0);
                Intrinsics.checkExpressionValueIsNotNull((Object)value, "lastReceivedChunks[0]");
                final ChunkPos chunkPos = value;
                final ChunkPos value2 = this.Field12962.get(1);
                Intrinsics.checkExpressionValueIsNotNull((Object)value2, "lastReceivedChunks[1]");
                this.Field12964 = this.Method4513(chunkPos, value2);
                this.Field12968 = 0;
                break;
            }
            case 3: {
                final int n2 = 0;
                final int index = 0;
                final Iterator iterator = this.Field12962.iterator();
                while (iterator.hasNext() && !Intrinsics.areEqual((Object)this.Field12960.get(index).Method6989(), (Object)iterator.next())) {}
                this.Field12964 = this.Method4512(n2);
                this.Field12968 = 0;
                break;
            }
            case 4: {
                this.Field12968 = 0;
                break;
            }
        }
        this.Method4515();
        final Class504 method7565 = Class504.Field10121.Method7551();
        if (method7565 == null) {
            Intrinsics.throwNpe();
        }
        final Class44 method7566 = method7565.Method2317();
        Intrinsics.checkExpressionValueIsNotNull((Object)method7566, "NoComTrackerModule.instance!!.x");
        method7566.Method370(this.Method4511().getX());
        final Class504 method7567 = Class504.Field10121.Method7551();
        if (method7567 == null) {
            Intrinsics.throwNpe();
        }
        final Class44 method7568 = method7567.Method2318();
        Intrinsics.checkExpressionValueIsNotNull((Object)method7568, "NoComTrackerModule.instance!!.z");
        method7568.Method370(this.Method4511().getZ());
        this.Field12962.clear();
        this.Method4510();
        if (this.Field12968 == 0) {
            this.Field12969++;
        }
        else {
            final Class504 method7569 = Class504.Field10121.Method7551();
            if (method7569 == null) {
                Intrinsics.throwNpe();
            }
            final Class44 method7570 = method7569.Method2324();
            Intrinsics.checkExpressionValueIsNotNull((Object)method7570, "NoComTrackerModule.instance!!.autoSpiral");
            if (method7570.Method365()) {
                final double n3 = this.Field12968;
                final Class504 method7571 = Class504.Field10121.Method7551();
                if (method7571 == null) {
                    Intrinsics.throwNpe();
                }
                final Class44 method7572 = method7571.Method2325();
                Intrinsics.checkExpressionValueIsNotNull((Object)method7572, "NoComTrackerModule.instance!!.spiralTrigger");
                if (n3 > method7572.Method367()) {
                    this.Field12967 = true;
                    final Class504 method7573 = Class504.Field10121.Method7551();
                    if (method7573 == null) {
                        Intrinsics.throwNpe();
                    }
                    final Class44 method7574 = method7573.Method2321();
                    Intrinsics.checkExpressionValueIsNotNull((Object)method7574, "NoComTrackerModule.instance!!.debugErrors");
                    if (method7574.Method365()) {
                        final String s3 = "Enabling Spiral Scanner";
                        final Class1740 method7575 = Class1393.Method5507();
                        Intrinsics.checkExpressionValueIsNotNull((Object)method7575, "ChatUtility.warning()");
                        this.Method4516(s3, method7575);
                    }
                }
            }
        }
        this.Field12966 = true;
    }
    
    public final void Method4505(final int field12963) {
        if (this.Field12963 == field12963) {
            return;
        }
        final BlockPos method4511 = this.Method4511();
        final int getX = method4511.getX();
        final int getZ = method4511.getZ();
        int n;
        int n2;
        if (field12963 == -1) {
            n = getX / 8;
            n2 = getZ / 8;
            final Class504 method4512 = Class504.Field10121.Method7551();
            if (method4512 == null) {
                Intrinsics.throwNpe();
            }
            final Class44 method4513 = method4512.Method2320();
            Intrinsics.checkExpressionValueIsNotNull((Object)method4513, "NoComTrackerModule.instance!!.debug");
            if (method4513.Method365()) {
                final String s = "Dimension has been changed to nether.";
                final Class1740 method4514 = Class1393.Method5507();
                Intrinsics.checkExpressionValueIsNotNull((Object)method4514, "ChatUtility.warning()");
                this.Method4516(s, method4514);
            }
        }
        else {
            n = getX * 8;
            n2 = getZ * 8;
            final Class504 method4515 = Class504.Field10121.Method7551();
            if (method4515 == null) {
                Intrinsics.throwNpe();
            }
            final Class44 method4516 = method4515.Method2320();
            Intrinsics.checkExpressionValueIsNotNull((Object)method4516, "NoComTrackerModule.instance!!.debug");
            if (method4516.Method365()) {
                final String string = "Dimension has been changed to " + ((field12963 == 0) ? "overworld" : "end") + '.';
                final Class1740 method4517 = Class1393.Method5507();
                Intrinsics.checkExpressionValueIsNotNull((Object)method4517, "ChatUtility.warning()");
                this.Method4516(string, method4517);
            }
        }
        this.Field12963 = field12963;
        if (this.Field12967) {
            this.Method4509();
        }
        this.Method4514(n, n2);
        this.Field12966 = true;
    }
    
    public final boolean Method4506(final int n) {
        final Class504 method7551 = Class504.Field10121.Method7551();
        if (method7551 == null) {
            Intrinsics.throwNpe();
        }
        final Class44 method7552 = method7551.Method2327();
        Intrinsics.checkExpressionValueIsNotNull((Object)method7552, "NoComTrackerModule.instance!!.spiralChunkStep");
        final int n2 = method7552.Method335() * 16;
        int n3 = 0;
        final Class504 method7553 = Class504.Field10121.Method7551();
        if (method7553 == null) {
            Intrinsics.throwNpe();
        }
        final Class44 method7554 = method7553.Method2326();
        Intrinsics.checkExpressionValueIsNotNull((Object)method7554, "NoComTrackerModule.instance!!.spiralPPT");
        final int method7555 = method7554.Method335();
        if (n3 <= method7555) {
            while (true) {
                final BlockPos blockPos = new BlockPos(this.Field12970 + this.Method4511().getX(), 0, this.Field12971 + this.Method4511().getZ());
                Class2142.Field17803.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging$Action.ABORT_DESTROY_BLOCK, blockPos, EnumFacing.UP));
                this.Field12961.add(new ChunkPos(blockPos));
                if (Math.abs(this.Field12970) <= Math.abs(this.Field12971) && (this.Field12970 != this.Field12971 || this.Field12970 >= 0)) {
                    this.Field12970 += ((this.Field12971 >= 0) ? n2 : (-n2));
                }
                else {
                    this.Field12971 += ((this.Field12970 >= 0) ? (-n2) : n2);
                }
                if (n3 == method7555) {
                    break;
                }
                ++n3;
            }
        }
        return this.Field12970 < n;
    }
    
    public final void Method4507(@NotNull @NotNull final ChunkPos chunkPos) {
        Intrinsics.checkParameterIsNotNull((Object)chunkPos, "pos");
        this.Field12962.add(chunkPos);
        this.Field12961.remove(chunkPos);
        if (this.Field12967) {
            final Class504 method7551 = Class504.Field10121.Method7551();
            if (method7551 == null) {
                Intrinsics.throwNpe();
            }
            final Class44 method7552 = method7551.Method2320();
            Intrinsics.checkExpressionValueIsNotNull((Object)method7552, "NoComTrackerModule.instance!!.debug");
            if (method7552.Method365()) {
                final String s = "Spiral found target. Tracking...";
                final Class1740 method7553 = Class1393.Method5503();
                Intrinsics.checkExpressionValueIsNotNull((Object)method7553, "ChatUtility.complete()");
                this.Method4516(s, method7553);
            }
            this.Method4509();
            this.Method4504();
        }
    }
    
    public final boolean Method4508() {
        final double n = (double)(System.currentTimeMillis() - this.Field12965);
        final Class504 method7551 = Class504.Field10121.Method7551();
        if (method7551 == null) {
            Intrinsics.throwNpe();
        }
        final Class44 method7552 = method7551.Method2319();
        Intrinsics.checkExpressionValueIsNotNull((Object)method7552, "NoComTrackerModule.instance!!.timeOut");
        if (n > method7552.Method367()) {
            this.Field12966 = true;
        }
        if (!this.Field12966) {
            return false;
        }
        this.Field12961.clear();
        for (final Class1884 class1884 : this.Field12960) {
            final Class504 method7553 = Class504.Field10121.Method7551();
            if (method7553 == null) {
                Intrinsics.throwNpe();
            }
            final Class44 method7554 = method7553.Method2320();
            Intrinsics.checkExpressionValueIsNotNull((Object)method7554, "NoComTrackerModule.instance!!.debug");
            if (method7554.Method365()) {
                final String s = "REQUESTING CHUNKS...";
                final Class1740 method7555 = Class1393.Method5507();
                Intrinsics.checkExpressionValueIsNotNull((Object)method7555, "ChatUtility.warning()");
                this.Method4516(s, method7555);
            }
            Class2142.Field17803.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging$Action.ABORT_DESTROY_BLOCK, class1884.Method6990(), EnumFacing.UP));
            this.Field12961.add(class1884.Method6989());
        }
        this.Field12966 = false;
        this.Field12965 = System.currentTimeMillis();
        return true;
    }
    
    public final void Method4509() {
        this.Field12967 = false;
        this.Field12970 = 0;
        this.Field12971 = 0;
        this.Field12961.clear();
    }
    
    private final void Method4510() {
        if (this.Field12968 > 0) {
            this.Field12958 = new StringBuilder().append('!').append(this.Field12968).append('!').toString();
        }
        else if (StringsKt.contains$default((CharSequence)this.Field12958, (CharSequence)"!", false, 2, (Object)null)) {
            this.Field12958 = "|";
        }
        final String field12958 = this.Field12958;
        switch (field12958.hashCode()) {
            case 124: {
                if (field12958.equals("|")) {
                    this.Field12958 = "/";
                    break;
                }
                break;
            }
            case 92: {
                if (field12958.equals("\\")) {
                    this.Field12958 = "|";
                    break;
                }
                break;
            }
            case 45: {
                if (field12958.equals("-")) {
                    this.Field12958 = "\\";
                    break;
                }
                break;
            }
            case 47: {
                if (field12958.equals("/")) {
                    this.Field12958 = "-";
                    break;
                }
                break;
            }
        }
    }
    
    private final BlockPos Method4511() {
        final ChunkPos field12964 = this.Field12964;
        if (field12964 == null) {
            Intrinsics.throwNpe();
        }
        final BlockPos getBlock = field12964.getBlock(0, 0, 0);
        Intrinsics.checkExpressionValueIsNotNull((Object)getBlock, "estimatedCenter!!.getBlock(0, 0, 0)");
        return getBlock;
    }
    
    private final ChunkPos Method4512(final int n) {
        ChunkPos chunkPos = null;
        switch (n) {
            case 0: {
                chunkPos = this.Field12960.get(3).Method6989();
                break;
            }
            case 1: {
                chunkPos = this.Field12960.get(2).Method6989();
                break;
            }
            case 2: {
                chunkPos = this.Field12960.get(1).Method6989();
                break;
            }
            case 3: {
                chunkPos = this.Field12960.get(0).Method6989();
                break;
            }
            default: {
                if ((chunkPos = this.Field12964) == null) {
                    Intrinsics.throwNpe();
                    break;
                }
                break;
            }
        }
        return chunkPos;
    }
    
    private final ChunkPos Method4513(final ChunkPos chunkPos, final ChunkPos chunkPos2) {
        return new ChunkPos((chunkPos.x + chunkPos2.x) / 2, (chunkPos.x + chunkPos2.x) / 2);
    }
    
    private final void Method4514(final int n, final int n2) {
        final Class504 method7551 = Class504.Field10121.Method7551();
        if (method7551 == null) {
            Intrinsics.throwNpe();
        }
        final Class44 method7552 = method7551.Method2317();
        Intrinsics.checkExpressionValueIsNotNull((Object)method7552, "NoComTrackerModule.instance!!.x");
        method7552.Method370(n);
        final Class504 method7553 = Class504.Field10121.Method7551();
        if (method7553 == null) {
            Intrinsics.throwNpe();
        }
        final Class44 method7554 = method7553.Method2318();
        Intrinsics.checkExpressionValueIsNotNull((Object)method7554, "NoComTrackerModule.instance!!.z");
        method7554.Method370(n2);
        this.Field12964 = new ChunkPos(new BlockPos(n, 0, n2));
    }
    
    private final void Method4515() {
        int index = 0;
        while (true) {
            final ChunkPos field12964 = this.Field12964;
            if (field12964 == null) {
                Intrinsics.throwNpe();
            }
            final int x = field12964.x;
            final ChunkPos field12965 = this.Field12964;
            if (field12965 == null) {
                Intrinsics.throwNpe();
            }
            final int z = field12965.z;
            final int n = x;
            final Number value = this.Field12959.get();
            Intrinsics.checkExpressionValueIsNotNull((Object)value, "renderDistance.get()");
            final int n2 = n - value.intValue();
            final int n3 = z;
            final Number value2 = this.Field12959.get();
            Intrinsics.checkExpressionValueIsNotNull((Object)value2, "renderDistance.get()");
            this.Field12960.set(index, new Class1884(n2, n3 - value2.intValue()));
            ++index;
        }
    }
    
    private final void Method4516(final String s, final Class1740 class1740) {
        final Class504 method7551 = Class504.Field10121.Method7551();
        if (method7551 == null) {
            Intrinsics.throwNpe();
        }
        method7551.Method2328(s, class1740);
    }
    
    @NotNull
    @NotNull
    public final String Method4517() {
        final StringBuilder append = new StringBuilder().append("Last reported coordinates: ");
        String str = null;
        switch (this.Field12963) {
            case 0: {
                str = this.Method4511().getX() + ", " + this.Method4511().getZ() + " in dimension overworld / " + this.Method4511().getX() / 8 + ", " + this.Method4511().getZ() / 8 + " in dimension nether";
                break;
            }
            case 1: {
                str = this.Method4511().getX() + ", " + this.Method4511().getZ() + " in dimension end";
                break;
            }
            case -1: {
                str = this.Method4511().getX() + ", " + this.Method4511().getZ() + " in dimension nether / " + this.Method4511().getX() * 8 + ", " + this.Method4511().getZ() * 8 + " in dimension overworld";
                break;
            }
            default: {
                str = "kill yourself with love <3";
                break;
            }
        }
        return append.append(str).append("\n Successful polls: ").append(this.Field12969).append(" / failures before disabling module: ").append(this.Field12968).toString();
    }
    
    public Class1101(final int n, final int n2) {
        this.Field12958 = "|";
        final Class504 method7551 = Class504.Field10121.Method7551();
        if (method7551 == null) {
            Intrinsics.throwNpe();
        }
        final Class44 method7552 = method7551.Method2323();
        Intrinsics.checkExpressionValueIsNotNull((Object)method7552, "NoComTrackerModule.instance!!.renderDistance");
        this.Field12959 = method7552.Method392();
        this.Field12960 = new ArrayList(4);
        this.Field12961 = new ArrayList();
        this.Field12962 = new ArrayList();
        this.Field12963 = Class2142.Field17803.player.dimension;
        this.Field12965 = System.currentTimeMillis();
        this.Field12966 = true;
        this.Method4514(n, n2);
        this.Method4515();
    }
    
    private static String Method4518(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6896 ^ 0x4D));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
