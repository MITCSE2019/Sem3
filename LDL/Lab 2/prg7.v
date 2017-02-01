module prg7(x,y,z,f);
input x,y,z;
output f;
nand(y0,y,y);
nand(z0,z,z);
nand(p,x,z0,y0);
nand(f,p,y0);
endmodule

