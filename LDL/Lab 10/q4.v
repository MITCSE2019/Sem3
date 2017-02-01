module q4(w,s,f);
input [3:0]w;
input [1:0]s;
output f;
wire [0:3]y;
dec stage0(s,y,1'b1);
assign f=(y[0]&w[0])|(y[1]&w[1])|(y[2]&w[2])|(y[3]&w[3]);
endmodule

module dec(w,y,en);
input [1:0]w;
input en;
output [0:3]y;
reg [0:3]y;
always @(w or en)
if(en==1)
if(w==0)
y=8'b1000;
else if(w==1)
y=8'b0100;
else if(w==2)
y=8'b0010;
else if(w==3)
y=8'b0001;
else 
y=8'b0000;
endmodule
