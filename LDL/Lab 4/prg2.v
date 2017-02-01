 module prg2(a,b,d,f);
input a,b,d;
output f;
nand(b0,b,b);
nand(x,a,b0);
nand(f,x,d);
endmodule

