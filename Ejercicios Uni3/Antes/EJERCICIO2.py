int foo() {
     int a = 24;
     int b = 25; // almacenamiento muerto
     int c = a << 2;
     if (true) //código muerto
     c = a << 2; //código redundante
     return c;
     b = 24; // código inalcanzable