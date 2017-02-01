module bit4up_down(sig,clk,Q);
input clk,sig;
output [3:0]Q;
tflipflop st0(1,clk,Q[0]);
tflipflop st1(~(sig^Q[0]),clk,Q[1]);
tflipflop st2(~(sig^Q[1]),clk,Q[2]);
tflipflop st3(~(sig^Q[2]),clk,Q[3]);
endmodule

module tflipflop(T,clk,Q);
input T,clk;
output Q;
reg Q;
always@(posedge clk)
if(!T)
Q<=Q;
else
Q<=~Q;
endmodule
