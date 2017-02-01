module prg1(a,b,d,f);
input a,b,d;
output f;
nor(b0,b,b);
nor(u,d,b0);
nor(d0,d,d);
nor(a0,a,a);
nor(v,a0,d0);
nor(f,u,v);
endmodule
