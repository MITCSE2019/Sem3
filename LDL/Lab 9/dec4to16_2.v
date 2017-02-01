module dec4to16_2(w,y,e);
input[3:0]w;
input e;
output [15:0]y;
wire [3:0]m;

dec2to4 stage0(w[3:2],m[3:0],e);
dec2to4 stage1(w[1:0],y[3:0],m[0]);
dec2to4 stage2(w[1:0],y[7:4],m[1]);
dec2to4 stage3(w[1:0],y[11:8],m[2]);
dec2to4 stage4(w[1:0],y[15:12],m[3]);

endmodule

module dec2to4(w,y,e);
input[1:0]w;
input e;
output [3:0]y;
reg[3:0]y;
integer k;

always @(w or e)
for(k=0;k<=3;k=k+1)
if((w==k)&&(e==1))
	y[k]=1;
else
	y[k]=0;
endmodule
