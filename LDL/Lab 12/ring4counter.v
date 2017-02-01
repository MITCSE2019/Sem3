module ring4counter(clk,T);
input clk;
output [0:3]T;
wire[1:0]A;
counter2bit st1(1,clk,A);
decoder2to4 st2(A,T);
endmodule

module decoder2to4(w,y);
input [1:0]w;
output [0:3]y;
reg [0:3]y;
integer i;
always @(w)
for(i=0;i<4;i=i+1)
if(w==i)
y[i]=1;
else
y[i]=0;
endmodule

module counter2bit(en,clk,A);
input clk,en;
output [1:0]A;
	
tflpflp st0(1,clk,A[0]);
tflpflp st1(1,A[0],A[1]);

endmodule

module tflpflp(T,clk,Q);
input T,clk;
output Q;
reg Q;
always@(posedge clk)
if(!T)
Q<=Q;
else
Q<=~Q;
endmodule
