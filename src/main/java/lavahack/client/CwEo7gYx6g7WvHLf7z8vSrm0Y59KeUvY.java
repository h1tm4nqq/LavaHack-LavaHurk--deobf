/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.awt.Color;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

public class CwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY {
    protected ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 Field17667 = null;
    protected Color Field17668 = exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11486.Method3625();
    protected Color Field17669 = exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11486.Method3625();
    protected float Field17670 = 1.0f;
    protected exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field17671 = null;
    private int Field17672;

    protected CwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY() {
    }

    public static CwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY Method7307() {
        return new CwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY();
    }

    public CwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY Method7308(ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22) {
        this.Field17667 = ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22;
        return this;
    }

    public CwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY Method7309(AxisAlignedBB axisAlignedBB) {
        this.Field17667 = new ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2(axisAlignedBB);
        return this;
    }

    public CwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY Method7310(BlockPos blockPos) {
        this.Field17667 = new ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2(blockPos);
        return this;
    }

    public CwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY Method7311(Color color) {
        this.Field17668 = color;
        return this;
    }

    public CwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY Method7312(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2) {
        this.Field17668 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method3625();
        return this;
    }

    public CwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY Method7313(Color color, Color color2) {
        this.Field17668 = color;
        this.Field17669 = color2;
        return this;
    }

    public CwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY Method7314(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3) {
        this.Field17668 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method3625();
        this.Field17669 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Method3625();
        return this;
    }

    public CwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY Method7315(float f) {
        this.Field17670 = f;
        return this;
    }

    public CwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY Method7316(exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        this.Field17671 = exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        return this;
    }

    public void Method7317() {
        if (this.Field17667 == null) return;
        if (this.Field17671 == null) {
            return;
        }
        AxisAlignedBB axisAlignedBB = exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3447(this.Field17667.Method4989());
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3446(axisAlignedBB, this.Field17670, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(this.Field17668), new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(this.Field17669), this.Field17671);
    }
}

