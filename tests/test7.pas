program test7;
begin
b:=5;
case b of
    5: b:=3;
WriteLn(b);
a:=2;
case a of
    2: a:=4;
WriteLn(a);
end.
(*
3.0
4.0
*)