module prg8(x1,x2,x3,f);
input x1,x2,x3;
output f;
nor(a,x1,x2);
nor(b,x1,x1);
nor(c,x3,x3);
nor(d,b,c);
nor(f,d,a);
endmodule
