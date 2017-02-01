module bcd1(ci,y,x,s,co);
input [0:3]y,x;
input ci;
output [3:0]s;
output co;
wire [3:0]z;
adder4 n1(ci,x,y,z,k);
assign co=k|(z[3]&z[1])|(z[3]&z[2]);
wire [3:0]six;
assign six[0]=0;
assign six[1]=co;
assign six[2]=co;
assign six[3]=0;
adder4 n2(ci,z,six,s,m);
endmodule

module adder4(ci,x,y,s,co);
input ci;
input [3:0]x,y;
output [3:0]s;
output co;
wire [3:1]c;
fulladd stage0(ci,x[0],y[0],s[0],c[1]);
fulladd stage1(c[1],x[1],y[1],s[1],c[2]);
fulladd stage2(c[2],x[2],y[2],s[2],c[3]);
fulladd stage3(c[3],x[3],y[3],s[3],co);
endmodule

module fulladd(ci,x,y,s,co);
input ci,x,y;
output s,co;
assign s=x^y^ci;
assign co=(x&y)|(x&ci)|(y&ci);
endmodule
