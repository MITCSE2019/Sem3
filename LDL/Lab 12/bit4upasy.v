module bit4upasy(clk,Q);
input clk;
output [3:0]Q;
tflipflop st1(1,clk,Q[0]);
tflipflop st2(1,Q[0],Q[1]);
tflipflop st3(1,Q[1],Q[2]);
tflipflop st4(1,Q[2],Q[3]);
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
