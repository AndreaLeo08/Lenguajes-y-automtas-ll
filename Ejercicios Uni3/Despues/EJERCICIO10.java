main() {
int i, j, k;
static float  x[N], y[N];
for(k=0; k<ITER; k++)     {
    x[0] = 0;
    x[N-1] = N-1;
    for(i=1; i<N-1; i++)
        x[i] = x[i]+y[i];
    }
}
