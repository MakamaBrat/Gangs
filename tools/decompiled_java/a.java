/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

final class a {
    static int[] a;
    int b;
    byte[] c;
    byte[] d;
    byte[] e;
    byte[] f;
    byte[] g;
    short[] h;
    byte[] i;
    byte[] j;
    byte[] k;
    short[] l;
    byte[] m;
    int[][] n;
    int o;
    private int J;
    boolean p;
    int q;
    byte[] r;
    short s;
    byte[] t;
    int[] u;
    Image[][] v;
    boolean w;
    int x;
    static final int[] y;
    byte[] z;
    int[] A;
    static int B;
    static int C;
    static byte[] D;
    private int K = 0;
    private int L = 0;
    static byte[] E;
    static short[] F;
    static int G;
    public static boolean H;
    public boolean I;

    a() {
    }

    final void a(byte[] byArray, int n) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        byArray = d.b(byArray);
        ++n;
        boolean bl = false;
        int n11 = ++n;
        int n12 = ++n;
        int n13 = ++n;
        int n14 = ++n;
        ++n;
        this.x = (byArray[n11] & 0xFF) + ((byArray[n12] & 0xFF) << 8) + ((byArray[n13] & 0xFF) << 16) + ((byArray[n14] & 0xFF) << 24);
        this.w = (this.x & 0x4000) != 0;
        if ((this.x & 1) != 0) {
            this.b = (byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8);
            if (this.b > 0) {
                if ((this.x & 2) != 0) {
                    this.c = new byte[this.b];
                    this.d = new byte[this.b];
                }
                this.e = new byte[this.b];
                this.f = new byte[this.b];
                this.z = new byte[this.b];
                this.A = new int[this.b];
                n10 = 1;
                for (n9 = 0; n9 < this.b; ++n9) {
                    if ((n8 = byArray[n++]) == -1) {
                        n7 = byArray[n++];
                        n6 = byArray[n++];
                        n5 = byArray[n++];
                        n4 = byArray[n++];
                        this.e[n9] = byArray[n++];
                        this.f[n9] = byArray[n++];
                        this.z[n9] = 2;
                        this.A[n9] = (n4 & 0xFF) << 24 | (n5 & 0xFF) << 16 | (n6 & 0xFF) << 8 | n7 & 0xFF;
                        n10 = 0;
                        continue;
                    }
                    if (n8 == -2) {
                        n7 = byArray[n++];
                        n6 = byArray[n++];
                        n5 = byArray[n++];
                        n4 = byArray[n++];
                        this.e[n9] = byArray[n++];
                        this.f[n9] = byArray[n++];
                        this.z[n9] = 1;
                        this.A[n9] = (n4 & 0xFF) << 24 | (n5 & 0xFF) << 16 | (n6 & 0xFF) << 8 | n7 & 0xFF;
                        n10 = 0;
                        continue;
                    }
                    if ((this.x & 2) != 0) {
                        this.c[n9] = n8;
                        this.d[n9] = byArray[n++];
                        this.e[n9] = byArray[n++];
                        this.f[n9] = byArray[n++];
                    } else {
                        this.e[n9] = n8;
                        this.f[n9] = byArray[n++];
                    }
                    this.z[n9] = 0;
                }
                if (n10 != 0) {
                    this.A = null;
                }
            }
        }
        if ((n10 = (byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8)) > 0) {
            this.j = this.w ? new byte[n10 * 5] : new byte[n10 << 2];
            System.arraycopy(byArray, n, this.j, 0, this.j.length);
            n += this.j.length;
        }
        if ((n9 = (byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8)) > 0) {
            this.g = new byte[n9];
            this.h = new short[n9];
            for (n8 = 0; n8 < n9; ++n8) {
                this.g[n8] = byArray[n++];
                int n15 = ++n;
                int n16 = ++n;
                ++n;
                this.h[n8] = (short)((byArray[n15] & 0xFF) + ((byArray[n16] & 0xFF) << 8));
            }
            n8 = n9 << 2;
            this.i = new byte[n8];
            for (n4 = 0; n4 < n8; ++n4) {
                this.i[n4] = byArray[n++];
            }
        }
        if ((n8 = (byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8)) > 0) {
            this.m = new byte[n8 * 5];
            System.arraycopy(byArray, n, this.m, 0, this.m.length);
            n += this.m.length;
        }
        if ((n4 = (byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8)) > 0) {
            this.k = new byte[n4];
            this.l = new short[n4];
            for (n5 = 0; n5 < n4; ++n5) {
                this.k[n5] = byArray[n++];
                int n17 = ++n;
                int n18 = ++n;
                ++n;
                this.l[n5] = (short)((byArray[n17] & 0xFF) + ((byArray[n18] & 0xFF) << 8));
            }
        }
        if (this.b <= 0) {
            return;
        }
        if ((this.x & 0x20000000) != 0) {
            n5 = (byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8);
            this.t = new byte[n5];
            System.arraycopy(byArray, n, this.t, 0, n5);
            n += n5;
            this.o = byArray[n++] & 0xFF;
            this.q = byArray[n++] & 0xFF;
            if (this.q == 0) {
                this.q = 256;
            }
            n6 = this.q * 3 + 4 + this.q + 4;
            this.r = this.I ? new byte[2 * this.o * n6] : new byte[this.o * n6];
            System.arraycopy(byArray, n, this.r, 0, this.o * n6);
            if (this.I) {
                System.arraycopy(byArray, n, this.r, this.o * n6, this.o * n6);
                n7 = this.q * 3;
                byte[] byArray2 = new byte[n7 + 4];
                byte[] byArray3 = byArray2;
                byArray2[0] = 80;
                byArray3[1] = 76;
                byArray3[2] = 84;
                byArray3[3] = 69;
                for (int i = this.o; i < this.o * 2; ++i) {
                    System.arraycopy(this.r, n6 * i, byArray3, 4, n7);
                    for (int j = 4; j < n7; j += 3) {
                        int n19 = a.e(byArray3[j] << 16 | byArray3[j + 1] << 8 & 0xFF00 | byArray3[j + 2] & 0xFF);
                        byArray3[j] = (byte)(n19 >> 16 & 0xFF);
                        byArray3[j + 1] = (byte)(n19 >> 8 & 0xFF);
                        byArray3[j + 2] = (byte)(n19 & 0xFF);
                    }
                    System.arraycopy(byArray3, 4, this.r, n6 * i, n7);
                    long l = a.b(byArray3, n7 + 4);
                    this.r[n6 * i + n7] = (byte)((l & 0xFFFFFFFFFF000000L) >> 24);
                    this.r[n6 * i + n7 + 1] = (byte)((l & 0xFF0000L) >> 16);
                    this.r[n6 * i + n7 + 2] = (byte)((l & 0xFF00L) >> 8);
                    this.r[n6 * i + n7 + 3] = (byte)((l & 0xFFL) >> 0);
                }
            }
            if (this.I) {
                this.o *= 2;
            }
            return;
        }
        n5 = (short)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
        this.o = byArray[n++] & 0xFF;
        this.q = byArray[n++] & 0xFF;
        if (this.q == 0) {
            this.q = 256;
        }
        this.n = this.I ? (Object)new int[this.o * 2][] : (int[][])new int[this.o][];
        for (n6 = 0; n6 < this.o; ++n6) {
            this.n[n6] = new int[this.q];
            if (n5 == -30584) {
                for (n7 = 0; n7 < this.q; ++n7) {
                    n3 = byArray[n++] & 0xFF;
                    n3 += (byArray[n++] & 0xFF) << 8;
                    n3 += (byArray[n++] & 0xFF) << 16;
                    if (((n3 += (byArray[n++] & 0xFF) << 24) & 0xFF000000) != -16777216) {
                        this.p = true;
                    }
                    this.n[n6][n7] = n3;
                }
            } else if (n5 == 21781) {
                for (n7 = 0; n7 < this.q; ++n7) {
                    n3 = byArray[n++] & 0xFF;
                    int n20 = n++;
                    n2 = -16777216;
                    if (((n3 += (byArray[n20] & 0xFF) << 8) & 0x8000) != 32768) {
                        n2 = 0;
                        this.p = true;
                    }
                    this.n[n6][n7] = n2 | (n3 & 0x7C00) << 9 | (n3 & 0x3E0) << 6 | (n3 & 0x1F) << 3;
                }
            }
            if (!this.I) continue;
            this.n[this.o + n6] = a.a(6, this.n[n6]);
        }
        if (this.I) {
            this.o *= 2;
        }
        this.s = (short)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
        if (this.b > 0) {
            this.u = new int[this.b];
            n6 = 0;
            n7 = n;
            for (n3 = 0; n3 < this.b; ++n3) {
                n2 = (byArray[n7++] & 0xFF) + ((byArray[n7++] & 0xFF) << 8);
                this.u[n3] = n6;
                n7 += n2;
                n6 += n2;
            }
            this.t = new byte[n6];
            for (n3 = 0; n3 < this.b; ++n3) {
                n2 = (byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8);
                System.arraycopy(byArray, n, this.t, this.u[n3], n2);
                n += n2;
            }
        }
    }

    final void a() {
        this.t = null;
        this.u = null;
        if (this.n != null) {
            for (int i = 0; i < this.n.length; ++i) {
                this.n[i] = null;
            }
        }
        this.n = null;
        this.r = null;
        System.gc();
    }

    final void a(int n, int n2, int n3, int n4) {
        if (this.b == 0) {
            return;
        }
        if (n3 == -1) {
            n3 = this.b - 1;
        }
        if (this.v == null) {
            this.v = new Image[this.o][];
        }
        if ((this.x & 0x20000000) != 0) {
            if (this.v[n] == null) {
                this.v[n] = new Image[1];
            }
            int n5 = this.q * 3 + 4;
            int n6 = this.q + 4;
            System.arraycopy(this.r, n * (n5 + n6), this.t, 41, n5);
            System.arraycopy(this.r, n * (n5 + n6) + n5, this.t, 41 + n5 + 8, n6);
            this.v[n][0] = Image.createImage((byte[])this.t, (int)0, (int)this.t.length);
            return;
        }
        if (n4 >= 0) {
            for (int i = n2; i <= n3; ++i) {
                this.v[n][i] = this.v[n4][i];
            }
        } else {
            int n7 = n + 1;
            if (this.w) {
                n = 0;
                n7 = this.o;
            }
            int n8 = this.J;
            for (int i = n; i < n7; ++i) {
                if (this.v[i] == null) {
                    this.v[i] = new Image[this.b];
                }
                this.J = i;
                for (int j = n2; j <= n3; ++j) {
                    int[] nArray;
                    if (d.bu != null && (d.bu[j] >> i & 1) == 0 || this.z[j] != 0) continue;
                    int n9 = this.e[j] & 0xFF;
                    int n10 = this.f[j] & 0xFF;
                    if (n9 <= 0 || n10 <= 0 || (nArray = this.b(j, 0)) == null) continue;
                    boolean bl = false;
                    boolean bl2 = false;
                    this.v[i][j] = Image.createRGBImage((int[])nArray, (int)n9, (int)n10, (boolean)this.p);
                }
            }
            this.J = n8;
        }
    }

    final int a(int n, int n2) {
        return this.m[(this.l[n] + n2) * 5 + 1] & 0xFF;
    }

    final int a(int n) {
        return this.k[n] & 0xFF;
    }

    final int a(int n, long l) {
        int n2 = 0;
        int n3 = 0;
        for (int i = 0; i < this.a(n); ++i) {
            n3 += this.a(n, i);
        }
        l %= (long)n3;
        while (l >= 0L && n2 < this.a(n)) {
            l -= (long)this.a(n, n2);
            ++n2;
        }
        return n2 - 1;
    }

    final void a(int[] nArray, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = (this.l[n] + n2) * 5;
        int n9 = this.m[n8] & 0xFF;
        n9 |= (this.m[n8 + 4] & 0xC0) << 2;
        if ((n5 & 0x20) != 0) {
            n6 = (n5 & 1) != 0 ? (n6 += this.m[n8 + 2]) : (n6 -= this.m[n8 + 2]);
            n7 = (n5 & 2) != 0 ? (n7 += this.m[n8 + 3]) : (n7 -= this.m[n8 + 3]);
        }
        this.a(nArray, n9, n3, n4, n5 ^ this.m[n8 + 4] & 0xF, n6, n7);
    }

    final void a(int[] nArray, int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = n << 2;
        byte by = this.i[n7++];
        byte by2 = this.i[n7++];
        int n8 = this.i[n7++] & 0xFF;
        int n9 = this.i[n7] & 0xFF;
        n5 = (n4 & 1) != 0 ? (n5 += by + n8) : (n5 -= by);
        n6 = (n4 & 2) != 0 ? (n6 += by2 + n9) : (n6 -= by2);
        nArray[0] = n2 - (n5 << 8);
        nArray[1] = n3 - (n6 << 8);
        nArray[2] = nArray[0] + (n8 << 8);
        nArray[3] = nArray[1] + (n9 << 8);
    }

    final void a(int[] nArray, int n, int n2, int n3, int n4) {
        nArray[0] = n2;
        nArray[1] = n3;
        nArray[2] = n2 + ((this.e[n] & 0xFF) << 8);
        nArray[3] = n3 + ((this.f[n] & 0xFF) << 8);
    }

    final void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = (this.l[n] + n2) * 5;
        int n9 = this.m[n8] & 0xFF;
        n6 = (n5 & 1) != 0 ? (n6 += this.m[n8 + 2]) : (n6 -= this.m[n8 + 2]);
        n7 = (n5 & 2) != 0 ? (n7 += this.m[n8 + 3]) : (n7 -= this.m[n8 + 3]);
        this.a(graphics, n9 |= (this.m[n8 + 4] & 0xC0) << 2, n3 - n6, n4 - n7, n5 ^ this.m[n8 + 4] & 0xF, n6, n7);
    }

    final void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = this.g[n] & 0xFF;
        for (int i = 0; i < n7; ++i) {
            this.b(graphics, n, i, n2, n3, n4, n5, n6);
        }
    }

    final void b(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = this.w ? (this.h[n] + n2) * 5 : this.h[n] + n2 << 2;
        int n9 = this.j[n8 + (this.w ? 4 : 3)] & 0xFF;
        int n10 = this.j[n8] & 0xFF;
        n10 |= (n9 & 0xC0) << 2;
        n3 = (n5 & 1) != 0 ? (n3 -= this.j[n8 + 1]) : (n3 += this.j[n8 + 1]);
        n4 = (n5 & 2) != 0 ? (n4 -= this.j[n8 + 2]) : (n4 += this.j[n8 + 2]);
        if ((n9 & 0x10) != 0) {
            this.a(graphics, n10, n3, n4, n5 ^ n9 & 0xF, n6, n7);
            return;
        }
        if ((n5 & 1) != 0) {
            n3 -= this.e[n10] & 0xFF;
        }
        if ((n5 & 2) != 0) {
            n4 -= this.f[n10] & 0xFF;
        }
        this.a(graphics, n10, n3, n4, n5 ^ n9 & 0xF);
    }

    final void a(Graphics graphics, int n, int n2, int n3, int n4) {
        if (this.z[n] == 0) {
            if (this.I && H) {
                G = this.J;
                this.J = (this.o >> 1) + this.J;
            }
            if ((this.x & 0x20000000) != 0) {
                int n5 = this.e[n] & 0xFF;
                int n6 = this.f[n] & 0xFF;
                if (n5 <= 0 || n6 <= 0) {
                    return;
                }
                Image image = null;
                if (this.v == null || this.v[this.J] == null) {
                    this.a(this.J, 0, 0, 0);
                }
                image = this.v[this.J][0];
                graphics.drawRegion(image, this.c[n] & 0xFF, this.d[n] & 0xFF, n5, n6, y[n4 & 7], n2, n3, 0);
                if (this.I && H) {
                    this.J = G;
                }
                return;
            }
            int n7 = this.e[n] & 0xFF;
            int n8 = this.f[n] & 0xFF;
            if (n7 <= 0 || n8 <= 0) {
                return;
            }
            Image image = null;
            if (this.v != null && this.v[this.J] != null) {
                image = this.v[this.J][n];
            }
            if (image == null) {
                int[] nArray = this.b(n, n4);
                if (nArray == null) {
                    return;
                }
                if (this.I && H) {
                    this.J = G;
                }
                graphics.drawRGB(nArray, 0, n7, n2, n3, n7, n8, true);
                return;
            }
            if ((n4 & 1) != 0) {
                if ((n4 & 2) != 0) {
                    graphics.drawRegion(image, 0, 0, n7, n8, 3, n2, n3, 0);
                } else {
                    graphics.drawRegion(image, 0, 0, n7, n8, 2, n2, n3, 0);
                }
            } else if ((n4 & 2) != 0) {
                graphics.drawRegion(image, 0, 0, n7, n8, 1, n2, n3, 0);
            } else {
                graphics.drawRegion(image, 0, 0, n7, n8, 0, n2, n3, 0);
            }
            if (this.I && H) {
                this.J = G;
                return;
            }
        } else {
            if (this.z[n] == 2) {
                if (this.I && H) {
                    graphics.setColor(a.e(this.A[n]));
                } else {
                    graphics.setColor(this.A[n]);
                }
                graphics.drawRect(n2, n3, (int)this.e[n], (int)this.f[n]);
                return;
            }
            if (this.z[n] == 1) {
                if (this.I && H) {
                    graphics.setColor(a.e(this.A[n]));
                } else {
                    graphics.setColor(this.A[n]);
                }
                graphics.fillRect(n2, n3, (int)this.e[n], (int)this.f[n]);
            }
        }
    }

    final int[] b(int n, int n2) {
        int n3;
        int n4;
        int n5;
        if (this.t == null || this.u == null) {
            return null;
        }
        int n6 = this.e[n] & 0xFF;
        int n7 = this.f[n] & 0xFF;
        int[] nArray = a;
        int[] nArray2 = this.n[this.J];
        if (nArray2 == null) {
            return null;
        }
        byte[] byArray = this.t;
        int n8 = this.u[n];
        int n9 = 0;
        int n10 = n6 * n7;
        if (this.s == 22258) {
            while (n9 < n10) {
                if ((n5 = byArray[n8++] & 0xFF) > 127) {
                    n5 -= 128;
                    while (n5-- > 0) {
                        nArray[n9++] = nArray2[byArray[n8++] & 0xFF];
                    }
                    continue;
                }
                n4 = nArray2[byArray[n8++] & 0xFF];
                while (n5-- > 0) {
                    nArray[n9++] = n4;
                }
            }
        } else if (this.s == 22018) {
            while (n9 < n10) {
                nArray[n9++] = nArray2[byArray[n8++] & 0xFF];
            }
        }
        if ((n2 & 1) != 0) {
            for (n4 = 0; n4 < n6 / 2; ++n4) {
                for (n3 = 0; n3 < n7; ++n3) {
                    n5 = nArray[n3 * n6 + n4];
                    nArray[n3 * n6 + n4] = nArray[n3 * n6 + n6 - n4 - 1];
                    nArray[n3 * n6 + n6 - n4 - 1] = n5;
                }
            }
        }
        if ((n2 & 2) != 0) {
            for (n4 = 0; n4 < n6; ++n4) {
                for (n3 = 0; n3 < n7 / 2; ++n3) {
                    n5 = nArray[n3 * n6 + n4];
                    nArray[n3 * n6 + n4] = nArray[(n7 - n3 - 1) * n6 + n4];
                    nArray[(n7 - n3 - 1) * n6 + n4] = n5;
                }
            }
        }
        return nArray;
    }

    final void b(int n) {
        this.J = n;
    }

    final int b() {
        return this.J;
    }

    final int c() {
        return this.K;
    }

    final void c(int n) {
        this.K = n;
    }

    final void d(int n) {
        this.L = n;
    }

    final void a(String string, int n, int n2, int n3) {
        int n4;
        int n5 = 0;
        short s = 0;
        int n6 = 0;
        boolean bl = false;
        int n7 = string.length();
        int n8 = this.j[this.h[0] << 2] & 0xFF;
        int n9 = this.j[this.h[0] << 2] & 0xFF;
        int n10 = this.j[(this.h[0] << 2) + 1] - this.j[this.h[1]];
        int n11 = (this.e[n9] & 0xFF) + this.L - n10;
        n -= n11;
        boolean bl2 = false;
        for (n4 = 0; n4 < 50; ++n4) {
            a.E[n4] = 0;
            a.F[n4] = 0;
        }
        B = 0;
        C = 0;
        for (n4 = 0; n4 <= n7; ++n4) {
            int n12;
            if (n4 == n7) {
                n12 = 10;
            } else {
                n12 = string.charAt(n4) & 0xFF;
                n6 = (byte)(n6 + 1);
            }
            if (n12 == 9 || n12 == 10 || n12 == 110 && bl2 || n12 == 116 && bl2) {
                if (F[n5] + s > n) {
                    if (F[n5] > B) {
                        B = F[n5];
                    }
                    a.F[++n5] = 0;
                    a.E[n5] = 0;
                    if (n5 > n2 && n5 <= n3) {
                        C += this.K + (this.f[n8] & 0xFF);
                    }
                    if (n5 == 50) break;
                    if (n5 + 1 != 50) {
                        a.E[n5 + 1] = 0;
                        a.F[n5 + 1] = 0;
                    }
                } else if (F[n5] + s > B) {
                    B = F[n5] + s;
                }
                int n13 = n5;
                F[n13] = (short)(F[n13] + s);
                int n14 = n5++;
                E[n14] = (byte)(E[n14] + n6);
                n6 = 0;
                s = 0;
                if (n5 > n2 && n5 <= n3) {
                    C += this.K + (this.f[n8] & 0xFF);
                }
                if (n5 == 50) break;
                a.E[n5] = 0;
                a.F[n5] = 0;
                if (n5 + 1 != 50) {
                    a.E[n5 + 1] = 0;
                    a.F[n5 + 1] = 0;
                }
                if (n12 == 9 || n12 == 116 && bl2) {
                    while (n5 % 4 != 0 && n5 < 50) {
                        a.E[n5] = 0;
                        a.F[n5] = 0;
                        if (n3 - n2 == 4 || ++n5 <= n2 || n5 > n3) continue;
                        C += this.K + (this.f[n8] & 0xFF);
                    }
                }
            } else {
                if (n12 == 92 && !bl2) {
                    bl2 = true;
                    continue;
                }
                if (bl2) {
                    bl2 = false;
                    continue;
                }
                int n15 = D[n12] & 0xFF;
                if (n15 >= this.h.length || this.g[n15] == 0) {
                    n12 = 32;
                    n15 = D[32] & 0xFF;
                }
                n9 = this.j[this.h[n15] << 2] & 0xFF;
                n10 = this.j[(this.h[n15] << 2) + 1] - this.j[this.h[1]];
                if (n12 == 32) {
                    if (F[n5] + s > n) {
                        if (F[n5] > B) {
                            B = F[n5];
                        }
                        int n16 = n5++;
                        F[n16] = (short)(F[n16] - ((this.e[n9] & 0xFF) + this.L - n10));
                        if (n5 > n2 && n5 <= n3) {
                            C += this.K + (this.f[n8] & 0xFF);
                        }
                        if (n5 == 50) break;
                        a.E[n5] = n6;
                        a.F[n5] = s = (short)(s + ((this.e[n9] & 0xFF) + this.L - n10));
                        if (n5 + 1 != 50) {
                            a.E[n5 + 1] = 0;
                            a.F[n5 + 1] = 0;
                        }
                    } else {
                        s = (short)(s + ((this.e[n9] & 0xFF) + this.L - n10));
                        int n17 = n5;
                        F[n17] = (short)(F[n17] + s);
                        int n18 = n5;
                        E[n18] = (byte)(E[n18] + n6);
                    }
                    n6 = 0;
                    s = 0;
                } else {
                    s = (short)(s + ((this.e[n9] & 0xFF) + this.L - n10));
                }
            }
            bl2 = false;
        }
        C -= this.K;
        B -= this.L;
    }

    final int b(Graphics graphics, int n, int n2, int n3, int n4) {
        return this.a(graphics, d.m(n), n2, n3, n4, 240, false);
    }

    final int a(Graphics graphics, int n, int n2, int n3, int n4, int n5, boolean bl) {
        return this.a(graphics, d.m(n), n2, n3, n4, n5, bl);
    }

    final int a(Graphics graphics, String string, int n, int n2, int n3) {
        return this.a(graphics, string, n, n2, n3, 240, false);
    }

    final int a(Graphics graphics, String string, int n, int n2, int n3, int n4, boolean bl) {
        return this.a(graphics, string, n, n2, n3, n4, 0, 50, bl);
    }

    final int a(Graphics graphics, String string, int n, int n2, int n3, int n4, int n5, int n6, boolean bl) {
        return this.a(graphics, string, n, n2, n3, n4, n5, n6, bl, false);
    }

    final int a(Graphics graphics, String string, int n, int n2, int n3, int n4, int n5, int n6, boolean bl, boolean bl2) {
        int n7;
        if (this == d.cX && string == d.ew) {
            this.c(2);
        }
        int n8 = this.j[this.h[0] << 2] & 0xFF;
        int n9 = 0;
        int n10 = 0;
        boolean bl3 = false;
        int n11 = this.K + (this.f[n8] & 0xFF);
        this.a(string, n4, n5, n6);
        if ((n3 & 0x20) != 0) {
            n2 -= C;
        } else if ((n3 & 2) != 0) {
            n2 -= C >> 1;
        }
        int n12 = 0;
        int n13 = 0;
        int n14 = n2;
        if (bl) {
            d.f(n14 - 4, n14 + C + 3);
        }
        for (n7 = 0; n7 < n5; ++n7) {
            n12 += E[n7];
        }
        for (n7 = n5; n7 < n6; ++n7) {
            int n15 = E[n7] & 0xFF;
            n13 = n;
            if ((n3 & 8) != 0) {
                n13 -= F[n7];
            } else if ((n3 & 1) != 0) {
                n13 -= F[n7] >> 1;
            }
            if (!bl2) {
                if (n13 < 1) {
                    n13 = 1;
                }
                if (n13 + F[n7] >= 240) {
                    n13 = 239 - F[n7];
                }
            }
            boolean bl4 = false;
            for (int i = 0; i < n15; ++i) {
                int n16;
                int n17 = string.charAt(n12) & 0xFF;
                if (n17 == 10 || n17 == 110 && bl4) {
                    ++n12;
                    break;
                }
                if (n17 == 9 || n17 == 116 && bl4) {
                    if (n6 - n5 == 4) {
                        return C;
                    }
                    ++n12;
                    break;
                }
                if (n17 == 92 && !bl4) {
                    ++n12;
                    bl4 = true;
                    continue;
                }
                if (bl4) {
                    if (n17 >= 48 && n17 <= 57) {
                        if (d.T == 13) {
                            this.b(3);
                        } else {
                            this.b(n17 - 48);
                        }
                    }
                    ++n12;
                    bl4 = false;
                    continue;
                }
                if (n17 >= D.length) {
                    n17 = 32;
                }
                if ((n16 = D[n17] & 0xFF) >= this.h.length || this.g[n16] == 0) {
                    n17 = 32;
                    n16 = D[32] & 0xFF;
                }
                if (n17 == 32 && i == n15 - 1) {
                    ++n12;
                    continue;
                }
                n9 = this.j[this.h[n16] << 2] & 0xFF;
                n10 = this.j[(this.h[n16] << 2) + 1] - this.j[this.h[1]];
                if (n16 != 0) {
                    this.a(graphics, n16, n13, n14, 0, 0, 0);
                }
                n13 += (this.e[n9] & 0xFF) + this.L - n10;
                ++n12;
            }
            n14 += n11;
        }
        if (this == d.cX && string == d.ew) {
            this.c(1);
        }
        return C;
    }

    static final int[] a(int n, int[] nArray) {
        if (n < 0) {
            return nArray;
        }
        if (n == 0) {
            return null;
        }
        int[] nArray2 = new int[nArray.length];
        switch (n) {
            case 6: {
                for (int i = 0; i < nArray.length; ++i) {
                    nArray2[i] = a.e(nArray[i]);
                }
                break;
            }
        }
        return nArray2;
    }

    static final int e(int n) {
        int n2 = n & 0xFF000000;
        int n3 = (n & 0xFF0000) >> 16;
        int n4 = (n & 0xFF00) >> 8;
        int n5 = n & 0xFF;
        n3 = (int)((double)n3 * 0.6) & 0xFF;
        n4 = (int)((double)n4 * 0.6) & 0xFF;
        n5 = (int)((double)n5 * 0.6 + 80.0) & 0xFF;
        n = n2 | n3 << 16 | n4 << 8 | n5;
        return n;
    }

    static final long a(long l, byte[] byArray, int n) {
        for (int i = 0; i < n; ++i) {
            long l2 = (int)(l ^ (long)byArray[i]) & 0xFF;
            for (int j = 0; j < 8; ++j) {
                if ((l2 & 1L) == 1L) {
                    l2 = 0xEDB88320L ^ l2 >> 1;
                    continue;
                }
                l2 >>= 1;
            }
            l = l2 ^ l >> 8;
        }
        return l;
    }

    static final long b(byte[] byArray, int n) {
        return a.a(0xFFFFFFFFL, byArray, n) ^ 0xFFFFFFFFL;
    }

    static {
        y = new int[]{0, 2, 1, 3, 5, 7, 4, 6};
        E = new byte[50];
        F = new short[50];
        H = false;
    }
}
