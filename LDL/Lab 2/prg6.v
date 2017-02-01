module prg6(x,y,z,f);
input x,y,z;
output f;
nor(a,x,y,z);
nor(z0,z,z);
nor(y0,y,y);
nor(b,x,y,z0);
nor(c,x,y0,z);
nor(f,a,b,c);
endmodule
