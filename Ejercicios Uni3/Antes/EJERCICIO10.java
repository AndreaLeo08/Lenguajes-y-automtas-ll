for(k=0; k<ITER; k++)
    for(i=0; i<N; i++)
       if(i==0) x[i] = 0;
       else if(i==N-1) x[i] = N-1;
       else x[i] = x[i]+y[i];
}
