Hash Code

- If you overwrite the equals method, you should always overwrite the hashCode method too!

- If not you break the general contract for Object.hashCode which may result in the class not functioning correctly in collections such as HashMap, HashSet, etc.

- hashCode contract
-- During one execution of the application the hashCode method must always return the same Integer when invoked
-- The Integer need not stay the same between different executions of the application
-- If two objects are equal according to the equals method then invoking the hashCode method must return the same Integer on both
-- The hashCode Integer can be the same between two objects that are not equal, but it isn't advised

- It is often the second rule that is broken

- Computing a hashCode
-- store some constant non-zero value in an int called result (for example)
-- for each significant field in the class, do the following
--- if boolean: compute (f ? 1 : 0)
--- if byte, char, short, int: compute (int) f
--- if long: compute (int) (f ^ (f >>> 32))
--- if float: compute Float.floatToIntBits(f)
--- if double: compute Double.doubleToLongBits(f) then hash as a long above (f ^ (f >>> 32))
--- if object reference: if classes equals method compares by recursively invoking equals then recursively invoke hashcode. otherwise, if a more complex comparison is needed, compute a canonical representation for this field and invoke hashcode on that representation
--- if an array: treat each element as if it were a separate field. i.e. compute a hashcode for each significant element by applying these rules recurisvely and combine the values as below (or you can use Arrays.hashcode if every field is significant)
-- combine the hashcode computed above (c) and combine it to result: result = 31 * result + c
-- return result

- You must exclude any fields not used in the equals method

- You should never have a hashCode method just simply return an integer value