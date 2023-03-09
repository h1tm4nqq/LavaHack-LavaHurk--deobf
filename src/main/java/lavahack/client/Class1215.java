/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import lavahack.client.Class106;
import lavahack.client.Class1184;
import lavahack.client.Class1223;
import lavahack.client.Class1798;
import lavahack.client.Class374;

public class Class1215 {
    private String Field13502;
    private String Field13503;
    private String Field13504;
    private Color Field13505;
    private Class106 Field13506;
    private Class1798 Field13507;
    private Class1223 Field13508;
    private Class374 Field13509;
    private List Field13510 = new ArrayList();
    private int Field13511;

    public String Method4895() {
        return this.Field13502;
    }

    public String Method4896() {
        return this.Field13503;
    }

    public String Method4897() {
        return this.Field13504;
    }

    public Color Method4898() {
        return this.Field13505;
    }

    public Class106 Method4899() {
        return this.Field13506;
    }

    public Class1798 Method4900() {
        return this.Field13507;
    }

    public Class1223 Method4901() {
        return this.Field13508;
    }

    public Class374 Method4902() {
        return this.Field13509;
    }

    public List Method4903() {
        return this.Field13510;
    }

    public Class1215 Method4904(String string) {
        this.Field13502 = string;
        return this;
    }

    public Class1215 Method4905(String string) {
        this.Field13503 = string;
        return this;
    }

    public Class1215 Method4906(String string) {
        this.Field13504 = string;
        return this;
    }

    public Class1215 Method4907(Color color) {
        this.Field13505 = color;
        return this;
    }

    public Class1215 Method4908(String string, String string2) {
        this.Field13506 = new Class106(this, string, string2, null);
        return this;
    }

    public Class1215 Method4909(String string) {
        this.Field13507 = new Class1798(this, string, null);
        return this;
    }

    public Class1215 Method4910(String string) {
        this.Field13508 = new Class1223(this, string, null);
        return this;
    }

    public Class1215 Method4911(String string, String string2, String string3) {
        this.Field13509 = new Class374(this, string, string2, string3, null);
        return this;
    }

    public Class1215 Method4912(String string, String string2, boolean bl) {
        this.Field13510.add(new Class1184(this, string, string2, bl, null));
        return this;
    }

    static Color Method4913(Class1215 class1215) {
        return class1215.Field13505;
    }
}

