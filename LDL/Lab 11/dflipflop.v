module dflipflop(D,clk,reset,Q);
input D,clk,reset;
output Q;
reg Q;
always@(negedge clk or negedge reset)
if(!reset)
Q<=0;
else
Q<=D;
endmodule
