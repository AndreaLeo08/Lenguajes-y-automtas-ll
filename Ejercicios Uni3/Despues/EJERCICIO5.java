main() {
int i, j, k;
static float x[N], y[N];
register float a, a1, a2, a3;
for(k=0; k<ITER; k++){
    a = a1 = a2 = a3 = 0.0;
    for(i=0; i<N; i+=4){
        a  = a  + x[i]   * y[i];
        a1 = a1 + x[i+1] * y[i+1];
        a2 = a2 + x[i+2] * y[i+2];
        a3 = a3 + x[i+3] * y[i+3];
        }
    a = a + a1 + a2 + a3;
    }
}
