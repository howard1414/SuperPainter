/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superpainter;
import java.awt.*;
/**
 *
 * @author HALUNA
 */
public class SaveLine {
    Point firstpoint;
    Point lastpoint;
    Pattern Pattern;
      SaveLine(Point start ,Point end,Pattern pat){
          firstpoint=start;
          lastpoint=end;
          Pattern = pat;
      }
}
