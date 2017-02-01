module bit4upsy(clk,Q);
input clk;
output [3:0]Q;
tflipflop st0(1,clk,Q[0]);
tflipflop st1(Q[0],clk,Q[1]);
tflipflop st2(Q[1],clk,Q[2]);
tflipflop st3(Q[2],clk,Q[3]);
endmodule

module tflipflop(T,clk,Q);
input T,clk;
output Q;
reg Q;
always@(negedge clk)
if(!T)
Q<=Q;
else
Q<=~Q;
endmodule
