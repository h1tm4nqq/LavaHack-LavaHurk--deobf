/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package lavahack.client;

import java.io.File;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Constructor;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import lavahack.client.Qb7S3VTi0GeBVQ7mOv2V9Y5DYrlMkFQH;
import lavahack.client.S0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a$1;
import lavahack.client.TavvzKLbTkwArgHdMwOmwomB8cZ2hgpZ;
import lavahack.client.gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh3;
import lavahack.client.jJcUSRXu0Im8nLcKYmuhBmfEwpYAcE2m;
import lavahack.client.pq70OGmwu3FWE691ok4mh7c14dWb0wv6;
import lavahack.client.pyogbsVjxjNmZ2zib3lZdYmbfXohhRe9;
import lavahack.client.qq8aSEIUqQ1gwjYnzJAmwtOPzc5ybZwN;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class S0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a {
    public static final Logger Field9593;
    private static final S0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a Field9594;
    private static final String Field9595;
    private final Map Field9596 = new HashMap();
    private final Map Field9597 = new HashMap();
    private final TavvzKLbTkwArgHdMwOmwomB8cZ2hgpZ Field9598 = new TavvzKLbTkwArgHdMwOmwomB8cZ2hgpZ();
    private ClassLoader Field9599;
    private String Field9600 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static S0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a Method1845() {
        return Field9594;
    }

    public void Method1846(ClassLoader classLoader) {
        if (!(classLoader instanceof URLClassLoader)) {
            throw new IllegalArgumentException("PluginClassLoader was not an URLClassLoader, but: " + classLoader.getClass().getName());
        }
        this.Field9599 = classLoader;
        Field9593.info("PluginManager: Scanning for PluginConfigs.");
        File file = new File("kisman.cc/Plugins");
        Map map = this.Method1847(file.listFiles(), classLoader);
        map.keySet().removeAll(this.Field9597.keySet());
        File[] fileArray = this.Field9598.Method6945(map.values());
        this.Method1847(fileArray, classLoader);
    }

    private Map Method1847(File[] fileArray, ClassLoader classLoader) {
        HashMap hashMap = new HashMap();
        File[] fileArray2 = fileArray;
        int n = fileArray2.length;
        int n2 = (int)-1100465979L ^ 0xBE6838C5;
        while (n2 < n) {
            File file = fileArray2[n2];
            if (file.getName().endsWith(".jar")) {
                Field9593.info("PluginManager: Scanning " + file.getName());
                this.Method1849(file, classLoader, hashMap);
            }
            ++n2;
        }
        return hashMap;
    }

    public void Method1848() {
        Iterator iterator = this.Field9597.values().iterator();
        while (iterator.hasNext()) {
            gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh3 gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh32 = (gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh3)iterator.next();
            if (this.Field9596.containsKey(gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh32)) {
                Field9593.info("Can't register Plugin " + gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh32.Method6438() + ", a plugin with that name is already registered.");
                continue;
            }
            Field9593.info("Instantiating: " + gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh32.Method6438() + ", MainClass: " + gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh32.Method6442());
            Class<?> clazz = Class.forName(gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh32.Method6442());
            Constructor<?> constructor = clazz.getConstructor(new Class[(int)-2089182453L ^ 0x83799B0B]);
            constructor.setAccessible(((int)1414480764L ^ 0x544F437D) != 0);
            qq8aSEIUqQ1gwjYnzJAmwtOPzc5ybZwN qq8aSEIUqQ1gwjYnzJAmwtOPzc5ybZwN2 = (qq8aSEIUqQ1gwjYnzJAmwtOPzc5ybZwN)constructor.newInstance(new Object[(int)-955415410L ^ 0xC70D848E]);
            this.Field9596.put(gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh32, qq8aSEIUqQ1gwjYnzJAmwtOPzc5ybZwN2);
        }
    }

    private void Method1849(File file, ClassLoader classLoader, Map map) throws Exception {
        JarFile jarFile = new JarFile(file);
        Manifest manifest = jarFile.getManifest();
        Attributes attributes = manifest.getMainAttributes();
        String string = attributes.getValue("LavaHackConfig");
        if (string == null) {
            throw new pq70OGmwu3FWE691ok4mh7c14dWb0wv6(jarFile.getName() + ": Manifest doesn't provide a LavaHackConfig!");
        }
        String string2 = attributes.getValue("LavaHackVanilla");
        switch (S0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a$1.Field17606[pyogbsVjxjNmZ2zib3lZdYmbfXohhRe9.Method4870().ordinal()]) {
            case 1: {
                if (string2 != null && !string2.equals("false")) break;
                Field9593.info("Found Plugin to remap!");
                map.put(string, file);
                return;
            }
            case 2: 
            case 3: {
                if (string2 == null || !string2.equals("true")) break;
                return;
            }
        }
        Qb7S3VTi0GeBVQ7mOv2V9Y5DYrlMkFQH.Method5001((URLClassLoader)classLoader, file);
        gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh3 gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh32 = jJcUSRXu0Im8nLcKYmuhBmfEwpYAcE2m.Field15829.fromJson((Reader)new InputStreamReader(Objects.requireNonNull(classLoader.getResourceAsStream(string))), gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh3.class);
        if (gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh32 == null) {
            throw new pq70OGmwu3FWE691ok4mh7c14dWb0wv6(jarFile.getName() + ": Found a PluginConfig, but couldn't instantiate it.");
        }
        Field9593.info("Found PluginConfig: " + gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh32.Method6438() + ", MainClass: " + gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh32.Method6442() + ", Mixins: " + gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh32.Method6443());
        this.Field9597.put(string, gYhvxp0V0kCOoefhV4WhnyuWXAfwCzh32);
    }

    public Map Method1850() {
        return this.Field9597;
    }

    public Map Method1851() {
        return this.Field9596;
    }

    public ClassLoader Method1852() {
        return this.Field9599;
    }

    static {
        Field9595 = "kisman.cc/Plugins";
        Field9593 = LogManager.getLogger((String)"LavaHack Plugins");
        Field9594 = new S0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a();
    }

    private static String Method1853(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1361051468 ^ (long)-1361051468);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)148936507L ^ 0x8E097C4);
            int n2 = ((int)2020237976L ^ 0x786A62A3) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)-865566678L ^ 0xCC6898E3) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

