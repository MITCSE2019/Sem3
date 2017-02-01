module comparator4(a,b,eq,gt,lt);
input [3:0]a,b;
wire [3:0]i;
output eq,gt,lt;
assign i[3]=~(a[3]^b[3]);
assign i[2]=~(a[2]^b[2]);
assign i[1]=~(a[1]^b[1]); 
assign i[0]=~(a[0]^b[0]);
assign eq=i[0]&i[1]&i[2]&i[3];
assign gt = (a[3]&(~b[3]))|(i[3]&(~b[2])&a[2])|((~b[1])&a[1]&i[2]&i[3])|(i[1]&i[2]&i[3]&(~b[0])&a[0]);
assign lt = ~(eq|gt);
endmodule
