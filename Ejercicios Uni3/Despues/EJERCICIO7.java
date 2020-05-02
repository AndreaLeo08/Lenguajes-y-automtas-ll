main() {
int i, j, k;
static float x[2*N][2*N], z[2*N][2*N];
for(k=0; k<ITER; k++)
    for(j=-N; j<N; j++)
        for(i=-N; i<N; i++){
            if(i*i+j*j != 0)
              z[N+j][N+i] = x[N+j][N+i] / (i*i+j*j);
            else
              z[N+j][N+i] = 0.0F;
            }
}
