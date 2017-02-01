module prg1(x,y,z,f1,f2);
input x,y,z;
output f1,f2;
assign f1=x&(y|z);
assign f2=(x&y)|(x&z);
endmodule
