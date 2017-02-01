module bit8reg (in,op,clk,reset);
input [7:0]in;
output [7:0]op;
input clk,reset;
dflipflop stage0(in[0],clk,1,op[0]);
dflipflop stage1(in[1],clk,1,op[1]);
dflipflop stage2(in[2],clk,1,op[2]);
dflipflop stage3(in[3],clk,1,op[3]);
dflipflop stage4(in[4],clk,1,op[4]);
dflipflop stage5(in[5],clk,1,op[5]);
dflipflop stage6(in[6],clk,1,op[6]);
dflipflop stage7(in[7],clk,1,op[7]);
endmodule

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
