
/**
 * BinarySearchTree_Omoyola here.
 *
 * @author Abimbola Omoyola
 * @version 11/20/2019
 */
public class BinarySearchTree_Omoyola
{
           TreeNode root;
           
        public BinarySearchTree_Omoyola()
           {
               root = null;
           }
           
         public boolean insert(Student_Omoyola newStudent)
           {
               TreeNodeWrapper p = new TreeNodeWrapper();
               TreeNodeWrapper c = new TreeNodeWrapper();
                TreeNode n = new TreeNode();
               if( n == null){//Out Of Memory
                        System.out.println("******************Insert Sucess*****************");
                        return false;
                    }else
                        { n.node = newStudent.deepCopy(); // Fill the Treenode's fields
                          n.lc = null;
                          n.rc = null;
                          if(root == null)// tree is empty
                          { root = n;}
                          else
                          { findNode(newStudent.getKey(),p, c); // Fine the node's parent
                              if(newStudent.getKey().compareTo(p.get().node.getKey()) < 0 )
                                    p.get().lc = n; // Insert new Node as the left child
                           else
                                p.get().rc = n; // Inser new Node as left child
                            }
                            System.out.println("******************Insert Sucess*****************");
                            return true;
                        }
                    }// End Insert Method
           
         public Student_Omoyola fetch(String targetKey)
         {
             boolean found;
             TreeNodeWrapper p = new TreeNodeWrapper();
             TreeNodeWrapper c = new TreeNodeWrapper();
             found = findNode(targetKey, p, c);//Locate Node
             if(found == true){
                System.out.println("****** Student Found ******");
                return c.get().node.deepCopy();
                 }
             else
                return null;

         }// End fetch
         
         public boolean delete(String targetKey)
         {
            boolean found;
            TreeNodeWrapper p = new TreeNodeWrapper();
            TreeNodeWrapper c = new TreeNodeWrapper();
            TreeNode largest;
            TreeNode nextLargest;
            found = findNode(targetKey, p, c);
                if(found == false)// node not found
                    return false;
                    else
                    {if(c.get().lc == null && c.get().rc == null) // Case1// (No children)
                     
                     {if(p.get().lc == c.get()) // delete if node has a left child
                            p.get().lc = null;
                       if(p == c){
                          p = null;
                          c= null;
                        }else
                            p.get().rc = null; // delete if node has a right child

                    }// End Case 1
                 else if(c.get().lc == null  ||c.get().rc ==null)//Case 2 (1 child)
                      { if(p.get().lc == c.get()) //deleted node is a left child
                         { if(c.get().lc != null) // deleted node has a left child
                            p.get().lc = c.get().lc;
                          else
                            p.get().lc = c.get().rc;
                        }
                        else                        // deleted node is a right child
                        { if(c.get().lc != null)//deleted node has a left child
                            p.get().rc = c.get().lc;
                           else
                            p.get().rc = c.get().rc;
                        }
                        
                    }// End case 2
                  else//Case  3 deleted node as two children
                  { nextLargest = c.get().lc;
                   largest = nextLargest.rc;
                   if(largest != null)// left child has a right subtree
                   { while(largest.rc != null)// move down right subtree
                      { nextLargest = largest;
                          largest = largest.rc;
                      }
                      c.get().node = largest.node;// overwrite deleted node
                      nextLargest.rc = largest.lc;
                    }
                    else//Left Child does not have a right subtree
                    { nextLargest.rc = c.get().rc; // save the right subtree
                        if(p.get().lc == c.get()) // deleted node is a left child
                           p.get().lc = nextLargest; // jump around deleted node
                        else // Deleted nose is a right child
                            p.get().rc = nextLargest; // jump around deleted nose
                        }
                    }// end of case 3
                    return true;
                }// End of delete Method
                
                
         }
         
         public void LNRoutputTraversal(TreeNode root)
         {
            if(root.lc != null)
                LNRoutputTraversal(root.lc); // Traverse the entire Subtree
              System.out.println(root.node);
              if(root.rc !=null)
                LNRoutputTraversal(root.rc);
            
          }
         
         public void showAll()
         {
            if( root == null) // Check for empty tree
                System.out.println("The Structure is Empty");
                else
                System.out.println("STUDENT LIST");
                LNRoutputTraversal(root);
            
         }// endof ShowAll Method
         
         public boolean update(String targetKey, Student_Omoyola newStudent)
          { if(delete(targetKey) == false)
                return false;
            else if(insert(newStudent) == false)
                return false;
              return true;
            }//End of Update
         
         public class TreeNode
         {
             private Student_Omoyola node;
             private TreeNode lc;
             private TreeNode rc;
             
             public TreeNode()
             {
             }
            }// End of class TreeNode
          
         private boolean findNode(String targetKey, TreeNodeWrapper parent, TreeNodeWrapper child)
         { parent.set(root);
           child.set(root);
           if(root == null)// tree is empty
                return true;
           while(child.get() != null)
           { if(child.get().node.compareTo(targetKey) == 0)// Node founf
               return true;
             else
             { parent.set(child.get());
               if(targetKey.compareTo(child.get().node.getKey()) < 0 )
                    child.set(child.get().lc);
               else
                    child.set(child.get().rc);
                }
            }//end while
           return false;
        }//end findNode
        
        public class TreeNodeWrapper
        { TreeNode treeRef = null;
            public TreeNodeWrapper()
            {
            }
            public TreeNode get()
            {   
                return treeRef;
            }
            public void set(TreeNode t)
            {
                treeRef = t;
            }
        }// End of class Tree NodeWrapper
   }// End of class Binary tree
   

