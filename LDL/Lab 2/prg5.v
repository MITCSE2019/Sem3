module prg5 (a,b,c,f);
input a,b,c;
output f;
nand(x,a,b);
nand(y,b,c);
nand(z,c,a);
nand(f,x,y,z);
endmodule
