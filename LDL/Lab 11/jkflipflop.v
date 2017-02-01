module jkflipflop(in,clk,reset,Q);
input clk,reset;
input [1:0]in;
output Q;
reg Q;
always @ (posedge clk)
if(!reset)
Q<=0;
else if(in==0)
Q<=Q;
else if(in==1)
Q<=0;
else if(in==2)
Q<=1;
else if(in==3)
Q<=~Q;
endmodule
