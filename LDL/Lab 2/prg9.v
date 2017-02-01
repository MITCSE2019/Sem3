module prg9(x1,x2,x3,f);
input x1,x2,x3;
output f;
nand(a,x1,x1);
nand(b,x3,x3);
nand(x,x1,b);
nand(y,b,x2);
nand(z,x2,a);
nand(f,x,y,z);
endmodule
