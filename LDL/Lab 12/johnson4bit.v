module johnson4bit(clk,A);
input clk;
output [3:0]A;
dflipflop st0(~A[0],clk,A[3]);
dflipflop st1(A[3],clk,A[2]);
dflipflop st2(A[2],clk,A[1]);
dflipflop st3(A[1],clk,A[0]);
endmodule


module dflipflop(D,clk,Q);
input D,clk;
output Q;
reg Q;
always @(posedge clk)
Q<=D;
endmodule
