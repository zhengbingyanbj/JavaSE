package cn.itcast03.only;
/* 
 *   ArrayList的contains  
 *          判断  某个元素 是否在集合中存在 
 *          假如 这个元素 我们称为o
 *          
 *         遍历集合  得到每一个元素  
 *            然后让 o跟每一个元素 进行比较（equals方法） 
 *            如果结果为true  包含
 *            如果每一个结果都为false 那么集合不存在
 *         如果这个元素o是null呢  就去集合中寻找有没有==null元素 
 *         
 *   HashSet 
 *      add
 *        先算出 元素的 哈希地址  如果改地址 没有值 直接存储
 *        如果有  再通过该元素调用equals方法  
 *                  true  不添加
 *                  false  添加
 *                  
 *      contains 
 *         先计算 该元素 哈希值   如果存在 在进行equals判断 true  OK  false 没有
 *         哈希值不存在  就没有该元素
 *                  
 *        
 */
public class OnlyClass {
      
}
