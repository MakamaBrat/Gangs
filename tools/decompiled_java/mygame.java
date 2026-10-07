/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.midlet.MIDlet;

public final class mygame
extends MIDlet {
    static mygame a;
    static d b;

    public mygame() {
        a = this;
        b = new d();
    }

    public final void startApp() {
        b.m();
    }

    public final void pauseApp() {
        b.n();
    }

    public final void destroyApp(boolean bl) {
        b.o();
        this.notifyDestroyed();
    }
}
