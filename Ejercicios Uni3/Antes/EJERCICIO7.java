main() {
int i, j, k;
static float x[2*N][2*N], z[2*N][2*N];
for(k=0; k<ITER; k++)
    for(j=-N; j<N; j++) {
        for(i=-N; i<0; i++)
            z[N+j][N+i] = x[N+j][N+i] / (i*i+j*j);
        z[N+j][N] = 0.0F;
        for(i=1; i<N; i++)
            z[N+j][N+i] = x[N+j][N+i] / (i*i+j*j);
        }
}
