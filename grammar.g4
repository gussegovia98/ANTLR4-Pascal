grammar Grammar;

// Generate: antlr Grammar.g4
// Compile: javac -classpath /usr/local/lib/antlr-4.8-complete.jar *java;
// Run: grun Grammar start -gui tests/test#.pas;

@header{
    import java.util.HashMap;
    import java.util.Map;
    import java.util.*;
    import java.lang.*;
}

@members{
    HashMap<String, Double > map = new HashMap<String, Double>();
    HashMap<String, Boolean> map2 = new HashMap<String, Boolean>();
    String Pname;
    Scanner scnr = new Scanner(System.in);
    boolean truth = false;
    public boolean test() {
        if (truth) {
            truth = false;
            return true;
        }
        return false;
    }
}

start: statements EOF;

statements:
    // nothing 
    main
    |statement statements 
    | statement |
    ;


main: BEGIN statements END start {
    
}
;

statement: 
    ifStatements
    | programName
    |caseStatement
    | equalDef
    | inLine
    | sExpr
    | boolDef1
    | boolDef2
    | comment
    | varDef 
    
    //| testing
    ;



ifStatements: IF '('expr ')' THEN {
        if($expr.a){
            truth = true;
        }
    }
    (statement |) (ELSE{
        if(!$expr.a){
            truth=true;
        }
    }
    (statement | ))?
    ;



caseStatement: CASE ID OF caseFinder+ ;

caseFinder: expr ':' statement;

boolDef1: ID ':=' TRUE ';'{
    map2.put($ID.text,true);
};

boolDef2: ID ':=' FALSE ';'{
    map2.put($ID.text,false);
};


equalDef:  e1=ID ':=' e2=ID ';'{
    map.put($e1.text,(map.get($e2.text)));
    };

varDef: ID ':=' expr ';' { 
    if($expr.a){
        map2.put($ID.text,$expr.a);
    }
    else if($expr.i !=0){
        map.put($ID.text,$expr.i);
    }
    else{
        map2.put($ID.text,$expr.a);
        map.put($ID.text, $expr.i); 
    }
    //System.out.println($ID.text);
    //System.out.println($expr.i);
};


sExpr: expr ';' { 
    
};


inLine: INLinee {

};

comment: ANYTHING {

};


programName: PNAME ID ';' {
    Pname = $ID.text;
};

/*testing: 'helloa' {
    for (Map.Entry entry : map.entrySet())
    {
        System.out.println("key: " + entry.getKey() + "; value: " + entry.getValue());
    }
    for (Map.Entry entry2 : map2.entrySet())
    {
        System.out.println("key: " + entry2.getKey() + "; value: " + entry2.getValue());
    }
};
*/
expr returns[double i, boolean a]:
    '(' e=expr ')' { $i = $e.i; }

    | ID {$i= map.get($ID.text); }
    | ID '*' expr {$i = map.get($ID.text) * $expr.i;}
    | el=expr '*' er=expr { $i = $el.i * $er.i;}
    | expr '*' ID {$i = map.get($ID.text) * $expr.i;} 
    | ID '/' expr {$i = map.get($ID.text) / $expr.i;}
    | expr '/' ID {$i = $expr.i / map.get($ID.text);}
    | el=expr '/' er=expr { $i = $el.i / $er.i; }
    | ID '%' expr {$i = map.get($ID.text) % $expr.i;}
    | expr '%' ID {$i = $expr.i % map.get($ID.text);}
    | el=expr '%' er=expr { $i = $el.i % $er.i; }
    | ID '+' expr {$i = map.get($ID.text) + $expr.i;}
    | expr '+' ID {$i = map.get($ID.text) + $expr.i;}
    | el=expr '+' er=expr { $i = $el.i + $er.i; }
    | ID '-' expr {$i = map.get($ID.text) - $expr.i;}
    | expr '-' ID {$i = $expr.i  - map.get($ID.text);}
    | el=expr '-' er=expr { $i = $el.i - $er.i; }


    | ID '>' expr {if(map.get($ID.text)>$expr.i){$a=true;}else{$a=false;}}           
    | ID '<' expr {if(map.get($ID.text)<$expr.i){$a=true;}else{$a=false;}}     
    | ID '>=' expr {if(map.get($ID.text)>=$expr.i){$a=true;}else{$a=false;}}
    | ID '<=' expr {if(map.get($ID.text)<=$expr.i){$a=true;}else{$a=false;}}
    | ID '<>' expr {if(map.get($ID.text)!=$expr.i){$a=true;}else{$a=false;}}
    | ID '=' expr {if(map.get($ID.text)==$expr.i){$a=true;}else{$a=false;}}

    | el = expr op= '>' er=expr {if($el.i > $er.i){$a=true;}else{$a=false;}}
    | el = expr op='<' er=expr {if($el.i < $er.i){$a=true;}else{$a=false;}}
    | el = expr op='>=' er=expr {if($el.i >= $er.i){$a=true;}else{$a=false;}}
    | el = expr op='<=' er=expr {if($el.i <= $er.i){$a=true;}else{$a=false;}}
    | el = expr op='<>' er=expr {if($el.i != $er.i){$a=true;}else{$a=false;}}
    | el = expr op='=' er=expr {if($el.i == $er.i){$a=true;}else{$a=false;}}

   
    | ID AND TRUE {if(map2.get($ID.text) && true){$a=true;}else{$a=false;}} 
    | TRUE AND ID {if(map2.get($ID.text) && true){$a=true;}else{$a=false;}} 
    | ID AND FALSE {if(map2.get($ID.text) && false){$a=false;}else{$a=true;}} 
    | FALSE AND ID {if(map2.get($ID.text) && false){$a=false;}else{$a=true;}} 
    | ID OR TRUE {if(map2.get($ID.text) || true){$a=true;}else{$a=false;}} 
    | TRUE OR ID {if(map2.get($ID.text) || true){$a=true;}else{$a=false;}} 
    | ID OR FALSE {if(map2.get($ID.text) || false){$a=true;}else{$a=false;}} 
    | FALSE OR ID {if(map2.get($ID.text) || false){$a=true;}else{$a=false;}} 
    | e3=ID AND e4=ID {if(map2.get($e3.text) && map2.get($e4.text)){$a=true;}else{$a=false;}}
    | e3=ID OR e4=ID {if(map2.get($e3.text) || map2.get($e4.text)){$a=true;}else{$a=false;}}

    | el = expr op= AND er=expr {if($el.a && $er.a){$a=true;}else{$a=false;}}
    | el = expr op= OR er=expr {if($el.a || $er.a){$a=true;}else{$a=false;}}

    
    | SIN ID ')' {$i = Math.sin(map.get($ID.text));}
    | COS ID ')' {$i = Math.cos(map.get($ID.text));}
    | EXP ID ')' {$i = Math.exp(map.get($ID.text));}
    | LN ID ')' {$i = Math.log(map.get($ID.text));}
    | SIN expr ')' {$i = Math.sin($expr.i);}
    | COS expr ')' {$i = Math.cos($expr.i);}
    | EXP expr ')' {$i = Math.exp($expr.i);}
    | LN expr ')' {$i = Math.log($expr.i);}
    
    
    | WRITE ID ')'{
        if(map.get($ID.text)!=null && map2.get($ID.text)==null ){
             System.out.println(map.get($ID.text));
        }
        else if(map2.get($ID.text)!=null && map.get($ID.text)==null ){ 
            System.out.println(map2.get($ID.text));
        }
        else{
             System.out.println(map.get($ID.text));
        }
    }
    | WRITE expr ')'{
        if($expr.a){
            System.out.println($expr.a);
        }
        else{
            System.out.println($expr.i);
        }
        }
    | WRITE '\'' ID* '\'' ')' {
        System.out.println($ID.text);
        }
    | READ ID ')' {$i = scnr.nextDouble(); map.put($ID.text,$i);}

    
    | DOUBLE { $i = Double.parseDouble($DOUBLE.text); }
    ;


BEGIN: 'begin';
END: 'end.';
IF: 'if';
THEN: 'then';
ELSE: 'else';
CASE: 'case';
OF: 'of';
TRUE: 'true';
FALSE: 'false';
AND: 'AND';
OR: 'OR';
NOT: 'not';
SIN: 'Sin(';
PNAME: 'program ' ;
COS: 'Cos(';
EXP: 'Exp(';
LN: 'Ln(';
READ: 'ReadLn(';
WRITE: 'WriteLn(';
DOUBLE: ([0-9]*[.])?[0-9]+;
ANYTHING: '(*' .*? '*)';
INLinee: '//' .*? '\n';
ID: [_A-Za-z][_A-Za-z0-9]*;
INT: [0-9]+ ;
WS : [ \t\r\n]+ -> skip ;