module tflipflop(T,clk,reset,Q);
input T,clk,reset;
output Q;
reg Q;
always@(negedge clk)
if(!reset)
Q<=0;
else if(!T)
Q<=Q;
else
Q<=~Q;
endmodule
