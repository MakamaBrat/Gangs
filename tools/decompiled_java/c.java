/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class c {
    int a;
    int b;
    public a c;
    int d;
    int e;
    int f;
    int[] g;

    c() {
        this.g = new int[4];
    }

    c(a a2, int n, int n2) {
        this.a = n;
        this.b = n2;
        this.c = a2;
        this.g = new int[4];
    }

    final void a(a a2) {
        this.c = a2;
        this.d = 0;
        this.e = 0;
        this.f = 0;
    }

    final void a(int n) {
        if (n != this.d) {
            this.d = n;
            this.e = 0;
            this.f = 0;
        }
    }

    final boolean a() {
        if (this.e != this.c.a(this.d) - 1) {
            return false;
        }
        int n = this.c.a(this.d, this.e);
        return n == 0 || this.f >= n - 1;
    }

    final void a(Graphics graphics) {
        if (this.c == null) {
            return;
        }
        if (this.f >= 0) {
            this.c.a(graphics, this.d, this.e, this.a, this.b, 0, 0, 0);
            return;
        }
        if (this.d >= 0) {
            this.c.a(graphics, this.d, this.a, this.b, 0);
            return;
        }
        if (this.e >= 0) {
            this.c.a(graphics, this.e, this.a, this.b, 0, 0, 0);
        }
    }

    final void b() {
        if (this.c == null) {
            return;
        }
        if (this.f < 0) {
            return;
        }
        int n = this.c.a(this.d, this.e);
        if (n == 0) {
            return;
        }
        ++this.f;
        if (n > this.f) {
            return;
        }
        this.f = 0;
        ++this.e;
        if (this.e >= this.c.a(this.d)) {
            this.e = 0;
        }
    }

    final void b(int n) {
        if (this.c == null) {
            return;
        }
        if (this.f < 0) {
            return;
        }
        int n2 = this.c.a(this.d, this.e);
        if (n2 == 0) {
            return;
        }
        ++this.f;
        if (n2 > this.f) {
            return;
        }
        this.f = 0;
        ++this.e;
        if (this.e >= this.c.a(this.d)) {
            this.e = 0;
            this.a(n);
        }
    }

    final int[] c() {
        if (this.c != null) {
            if (this.f >= 0) {
                this.c.a(this.g, this.d, this.e, this.a, this.b, 0, 0, 0);
            } else if (this.d >= 0) {
                this.c.a(this.g, this.d, this.a, this.b, 0);
            } else if (this.e >= 0) {
                this.c.a(this.g, this.e, this.a, this.b, 0, 0, 0);
            }
        }
        return this.g;
    }

    final void c(int n) {
        this.c.b(n);
    }

    final int d() {
        return this.c.b();
    }
}
