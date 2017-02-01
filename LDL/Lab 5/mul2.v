module mul2(x,y,p);
input [1:0]x,y;
output [3:0]p;
wire [1:0]c;
assign p[0]=x[0]&y[0];
halfadd stage0((x[0]&y[1]),(x[1]&y[0]),p[1],c[0]);
halfadd stage1((x[1]&y[1]),c[0],p[2],c[1]);
assign p[3]=c[1];
endmodule


module halfadd(x,y,s,c);
input x,y;
output s,c;
assign s=x^y;
assign c= x&y;
endmodule
