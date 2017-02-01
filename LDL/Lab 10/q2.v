module q2(x,f1,f2,f3);
input [2:0]x;
output f1,f2,f3;
wire [0:7]y;
dec stage0(x,y,1'b1);
assign f1=y[0]|y[5]|y[7];
assign f2=y[2]|y[3]|y[4];
assign f3=y[1]|y[6]|y[7];
endmodule


module dec(w,y,en);
input [2:0]w;
input en;
output [0:7]y;
reg [0:7]y;
always @(w or en)
if(en==1)
if(w==0)
y=8'b10000000;
else if(w==1)
y=8'b01000000;
else if(w==2)
y=8'b00100000;
else if(w==3)
y=8'b000100000;
else if(w==4)
y=8'b00001000;
else if(w==5)
y=8'b00000100;
else if(w==6)
y=8'b00000010;
else if(w==7)
y=8'b00000001;
else 
y=8'b00000000;
endmodule

