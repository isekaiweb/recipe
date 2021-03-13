package com.example.recipe


fun foodRecipeData(): List<FoodRecipe> =
    listOf(

        FoodRecipe(
            id = 1,
            creatorName = "Lena Abraham",
            creatorPhoto = "https://hips.hearstapps.com/rover/profile_photos/846121db-9644-42e0-a4fd-cf5d105bfdf9_1576786748.file?fill=1:1&resize=80:*",
            foodName = "Egg Roll Bowls",
            foodPhoto = "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/190319-egg-roll-bowls-261-1554235668.jpg?crop=1xw:1xh;center,top&resize=768:*",
            story = "If you're a fan of crispy savory egg rolls, then you might consider this unwrapped version your dream lunch. Without the need to wrap or fry, this veggie-packed meal comes together in well under an hour. Garnish with crispy raw green onion, toasted sesame seeds, and plenty of Sriracha or chili oil.",
            ingredients = """
                    1 tbsp. vegetable oil
                    1 clove garlic, minced
                    1 tbsp. minced fresh ginger
                    1 lb. ground pork
                    1 tbsp. sesame oil
                    1/2 onion, thinly sliced
                    1 c. shredded carrot
                    1/4 green cabbage, thinly sliced
                    1/4 c. soy sauce
                    1 tbsp. Sriracha
                    Kosher salt
                    1 green onion, thinly sliced
                    1 tbsp. toasted sesame seeds
                """.trimIndent(),
            direction = """
                    1. In a large skillet over medium heat, heat vegetable oil. Add garlic and ginger and cook until fragrant, 1 minute.
                    
                    2. Push pork to the side and add sesame oil. Add onion, carrot, and cabbage. Stir to combine with meat and add soy sauce and Sriracha. Cook until cabbage is tender, 5 to 8 minutes. Season to taste with salt.
                    
                    3. Transfer mixture to a serving dish and garnish with green onions and sesame seeds. Serve.
                """.trimIndent()

        ),
        FoodRecipe(
            id = 2,
            creatorName = "Justin Sullivan",
            creatorPhoto = "https://hips.hearstapps.com/rover/profile_photos/634a0349-7e5f-4cc7-91e5-4515acddfac2_1584482216.file?fill=1:1&resize=80:*",
            foodName = "Irish Mule",
            foodPhoto = "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/delish-2021-irishmule-223-1-1615340541.jpg?crop=1.00xw:1.00xh;0,0&resize=980:*",
            story = "We at Delish have developed many Moscow Mule variations (from the blue-hued Mermaid Mule to the high-class Champagne Mule). We figured it was only a matter of time before we took the Mule on a road trip to another country. We settled on Ireland because we loved how the oaky, vanilla-y flavors that come from your favorite whiskey are so well complimented by the fresh ginger and lime. It’s the perfect slight twist on the classic that will surprise your guests and have them singing your praises (or maybe writing a limerick about you).",
            ingredients = """
                2 oz. Irish whiskey
                1 oz. lime juice 
                5-6 ounces ginger beer
                Lime wedge, for garnish
                Mint sprigs, for garnish
            """.trimIndent(),
            direction = """
                1. Fill a copper mug or highball glass with ice. Pour in Irish whiskey and lime juice, then top the glass with ginger beer. 
                
                2. Give it a quick stir, then garnish with a lime wedge and mint sprig.
            """.trimIndent()
        ),
        FoodRecipe(
            id = 3,
            creatorName = "Makinze Gore",
            creatorPhoto = "https://hips.hearstapps.com/rover/profile_photos/634a0349-7e5f-4cc7-91e5-4515acddfac2_1584482216.file?fill=1:1&resize=80:*",
            foodName = "Air Fryer Mozzarella-Stuffed Meatballs",
            foodPhoto = "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/delish-2021-airfryermeatballs-044-1614894847.jpg?crop=0.668xw:1.00xh;0.202xw,0&resize=980:*",
            story = "For crispy-on-the-outside, tender-on-the-inside meatballs, turn to the air fryer. It will replicate the crust you get when you pan fry—without any oil. Another bonus: You aren't required to stand near a splattering stove to turn the meatballs every couple of minutes. The air fryer does the work for you and gets all sides perfectly \"seared\". These are stuffed with mozzarella for an extra-fun surprise and once coated in your favorite marinara can be a meal all on their own. These are anything but your ordinary meatball and we are here for it! ",
            ingredients = """
                    1 lb. ground beef
                    1/2 c. bread crumbs
                    1/4 c. freshly grated Parmesan
                    1/4 c. freshly chopped parsley
                    1 large egg
                    2 cloves garlic, minced
                    1 tsp. dried oregano
                    Kosher salt
                    Freshly ground black pepper
                    3 oz. fresh mozzarella, cut into 16 cubes
                    Marinara, for serving
                """.trimIndent(),
            direction = """
                    1. In a large bowl, combine ground beef, bread crumbs, Parmesan, parsley, egg, garlic, and oregano. Season with salt and pepper. 
                    
                    2. Scoop about 2 tablespoons of meat and flatten into a patty in your hand. Place a cube of mozzarella in the center and pinch meat up around cheese and roll into a ball. Repeat with remaining meat to make 16 total meatballs. 
                    
                    3. Working in batches as needed, place meatballs in basket of air fryer and cook at 370° for 12 minutes. 
                    
                    4. Serve with warmed marinara.
                """.trimIndent()
        ),


        FoodRecipe(
            id = 4,
            creatorPhoto = "https://hips.hearstapps.com/rover/profile_photos/634a0349-7e5f-4cc7-91e5-4515acddfac2_1584482216.file?fill=1:1&resize=80:*",
            creatorName = "Justin Sullivan",
            foodName = "Nutty Irishman", foodPhoto ="https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/delish-2021-nuttyirishmancocktail-082-1615338723.jpg?crop=1.00xw:1.00xh;0,0&resize=980:*",
            story = """
                The “nutty” in the Nutty Irishman refers to hazelnut liqueur, which you might think is some super obscure ingredient, but you can usually find a bottle of the most famous brand—Frangelico—in your local liquor store. Its sweetness and subtle nuttiness  is the perfect partner to rich Irish cream. But if you can’t find it, opt for some other nut-flavored liqueur like amaretto. 

                We made this drunk extra “nutty” by adding a homemade Irish cream whipped cream and a sprinkling of crushed hazelnut. After one sip you might have a bit of a whip cream mustache, but you’ll already be whipping up a second one.
            """.trimIndent(), ingredients = """
                FOR THE IRISH WHIPPED CREAM:
                1 c. whipped cream
                1 tbsp. powdered sugar
                1/4 c. Irish cream (such as Baileys)
                
                FOR THE COCKTAIL:
                1 1/2 oz. Irish cream (such as Baileys)
                1 1/2 oz. hazelnut liqueur (such as Frangelico)
                1/2 tbsp. crushed hazelnuts or graham crackers
            """.trimIndent(), direction = """
                FOR IRISH WHIPPED CREAM:
                1. In the bowl of a stand mixer or a medium bowl with a hand mixer, whisk together cream and powdered sugar. Whip on high until stiff peaks form, then slowly add the Irish cream. Transfer cream into a piping bag or plastic bag with a corner snipped off and chill.
                
               FOR COCKTAIL:
               1. In a shaker, add Irish cream and hazelnut liqueur then fill with ice. Shake until the shaker is frosty, then strain the drink into a coup. Pipe over Irish whipped cream and garnish with hazelnuts
            """.trimIndent()
        ),


        FoodRecipe(
            id = 5, creatorName = "Lena Abraham", creatorPhoto = "https://hips.hearstapps.com/rover/profile_photos/846121db-9644-42e0-a4fd-cf5d105bfdf9_1576786748.file?fill=1:1&resize=80:*",
            foodName = "Classic Charoset",
            foodPhoto = "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/delish-200318-seo-charoset-horizontal-hand1-13848-eb-1585337718.jpg?crop=0.668xw:1.00xh;0.231xw,0&resize=768:*",
            story = """
            This easy charoset is the one you'll find on our Passover dinner table! Feel free to swap in your preferred nuts and dried fruit—promise we won't get offended.😄Chag Sameach!

            Charoset can be made up to 3 days in advance and stored in an airtight container in the refrigerator. If preparing in advance, add 1 teaspoon lemon juice to prevent apples from browning. 
        """.trimIndent(), ingredients = """
            3 medium apples, such as Fuji or Honeycrisp, peeled and finely diced
            1 c. toasted walnuts, roughly chopped
            1/4 c. golden raisins
            1/4 c. sweet red wine, such as Manischewitz
            1/2 tbsp. honey
            1 tsp. lemon zest
            1/2 tsp. ground cinnamon
            Pinch kosher salt
        """.trimIndent(),
            direction = "1. Combine all ingredients in a medium bowl and stir to combine. Let sit 30 minutes before serving."
        ),


        FoodRecipe(
            id = 6,
            creatorName = "Lena Abraham",
            creatorPhoto = "https://hips.hearstapps.com/rover/profile_photos/846121db-9644-42e0-a4fd-cf5d105bfdf9_1576786748.file?fill=1:1&resize=80:*",
            foodPhoto = "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/190319-split-pea-soup-138-1553791829.jpg?crop=1xw:0.9164255020608612xh;center,top&resize=980:*",
            foodName = "Split Pea Soup",
            story = """
            My Oma makes the BEST split pea soup. The secret? A good, smoky ham hock. It imparts so much delicious flavor, and if you're lucky you can get some meat off of it too. Serve with a slice of toasted sourdough and you're golden.

            Wait, what is a ham hock? Ham hock, aka pork knuckle, is in the ankle region of a pig. There's not a lot of fat, but it is covered in skin, which adds a ton of a flavor to the soup after you sear it. 

            I'm vegetarian, can I leave it out? Absolutely. Though we love the smoky flavor, this soup is still delicious without meat. 

            Can I make this ahead of time? Sure thing. Which is why we ❤️ soup. Leftovers will store well in the fridge for 4 to 5 days, or in the freezer for up to 3 months. If the soup thickens too much over time, stir in some water or broth when you reheat leftovers.
        """.trimIndent(),
            ingredients = """
            2 tbsp. extra virgin olive oil, divided
            1 (1 lb.) smoked ham hock
            1 medium yellow onion 
            2 medium leeks (white and pale green parts only), thinly sliced 
            2 large shallots, minced
            Kosher salt
            Freshly ground black pepper
            1 lb. dried green split peas
            8 c. low-sodium chicken broth
            2 sprigs fresh thyme, plus more for garnish
            2 bay leaves
        """.trimIndent(),
            direction = """
            1. In a large pot over medium heat, heat 1 tablespoon oil. Add ham hock and cook, turning occasionally, until golden on all sides, about 6 minutes total. Remove ham hock from pot and add remaining oil.
            
            2. Add onions, leeks, and shallots to the pot and season with salt and pepper. Cook until tender, 6 minutes more. Add split peas, chicken stock, thyme, bay leaves, and seared ham hock to the pot and bring to a boil. Reduce to a simmer and cook, stirring occasionally until peas are tender, about 1 hour. (If the soup gets too thick, add water 1/2 cup at a time until desired thickness is reached.)
            
            3. When peas are tender, remove bay leaf, thyme, and ham hock. Remove any meat from ham hock and shred. Use an immersion blender or countertop blender to purée roughly 1/4 of the soup. Return puréed soup to pot along with the shredded ham hock and season to taste with salt and pepper. Served topped with more fresh thyme and another crack of black pepper.
        """.trimIndent()
        ),


        FoodRecipe(
            id = 7,
            creatorPhoto = "https://hips.hearstapps.com/rover/profile_photos/743afec2-8cb0-4247-8722-05b4d891fe7a_1576786937.file?fill=1:1&resize=80:*",
            creatorName = "Makinze Gore",
            foodName = "Cajun Sweet Potato Tots",
            foodPhoto ="https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/delish-210211-sweet-potato-tater-tots-008-ab-1614890215.jpg?crop=1.00xw:1.00xh;0,0&resize=980:*",
            story = """
                    Turns out, homemade tater tots are surprisingly easy, and these crispy bites are a fun twist on the classic. Relying on Parmesan and cornstarch to hold them together, they also happen to be gluten free. The most important step is parboiling your potatoes. It'll make them easier to shred and will also help bind them together. The results are a tot that is crispy on the outside while soft (and almost creamy) on the inside. Don't be discouraged if they take on color on each side—that is not a bad thing here! But if you feel they are getting too dark, you can turn to crisp all four sides, not just the top and bottom. 

                    The dipping sauce is a bonus and will make your side dish sing! Once I started dipping I honestly could not stop. However, a classic honey mustard or ketchup also works well here. 
                """.trimIndent(),
            ingredients = """
                    FOR TATER TOTS:
                    2 sweet potatoes, peeled
                    1/2 c. freshly grated Parmesan
                    1/4 c. cornstarch
                    1 1/2 tsp. cajun seasoning
                    Kosher salt
                    
                    Freshly ground black pepper
                    FOR DIPPING SAUCE:
                    1/3 c. mayonnaise
                    2 tbsp. honey mustard
                    1 tsp. hot sauce
                """.trimIndent(), direction = """
                    1. Place sweet potatoes in a large pot and add enough water to completely cover potatoes. Bring to a boil over high heat. Boil until almost tender, but a knife still meets a little resistance, about 8 minutes. Drain and let cool.
                     
                    2. Preheat oven to 400° and grease a large baking sheet with cooking spray. When potatoes are cool enough to handle, grate on the large holes of a cheese grater. 
                    
                    3. Add grated potatoes, parmesan, cornstarch, and cajun seasoning to a large bowl. Season with salt and pepper and stir to combine well. Scoop out a heaping tablespoon sized amount and squeeze together with your hands and form into a tater tot shape. Place on prepared baking sheet and repeat with remaining sweet potatoes. 
                    
                    4. Bake until crispy and bottoms have darkened, flipping halfway through, about 40 minutes. 
                    5. Meanwhile, make sauce: Combine mayonnaise, honey mustard, and hot sauce in a small bowl. Add more honey mustard or hot sauce to taste. 
                    
                    6. Serve tater tots hot with dipping sauce.
                """.trimIndent()
        ),


        FoodRecipe(
            id = 8,
            creatorName = "Makinze Gore", creatorPhoto = "https://hips.hearstapps.com/rover/profile_photos/743afec2-8cb0-4247-8722-05b4d891fe7a_1576786937.file?fill=1:1&resize=80:*",
            foodName = "Best Carrot Cake", foodPhoto = "https://hips.hearstapps.com/del.h-cdn.co/assets/18/08/1519321610-carrot-cake-vertical.jpg?crop=1.00xw:0.834xh;0,0.0829xh&resize=768:*", story = """
            We understand that there's no short supply of carrot cake recipes in the universe, but ours is—quite simply—the best. It comes from our Deputy Editor's great-grandma and there's just no arguing with that. It will be the shining star among all your Easter Desserts this year. 

            Why vegetable oil?

            It's all about moisture, people! Cakes using vegetable are often noticeably more moist than cakes using butter. Why is this? Consider the whole ingredient: vegetable oil is liquid at room temperature, while butter solidifies. 

            Another case for veggie oil over butter? Tenderness. Butter has some percentage of water content (usually 15-20%). When that liquid is mixed with flour, gluten forms more rapidly. (We learned all about this when researching our sourdough recipe!) Vegetable oil, on the other hand, is 100% fat, meaning less gluten formation and ultimately, more tender cake.

            It also makes prep easier—no need to let butter soften or need to cream it with sugar. We love a good shortcut!

            Can I make it without raisins? Or pecans?

            You sure can! If you're not a fan of raisins, try dried cranberries or other dried fruit instead. If you'd like to try a larger dried fruit like apricots or figs, we'd suggest chopping them into raisin-sized pieces. You can also leave the dried fruit out all together. 

            We love the added crunch and flavor of pecans, but any nut would be great in this cake. Walnuts, cashews, or even pistachios would be delicious additions.

            Can I add pineapple?

            Classic old-fashioned carrots cake often include pineapple. While ours doesn't include any, this recipe works well with it. Add about 1/2 cup of chopped pineapple (drained if from a can!) when you add the carrots, raisins, and pecans. 

            Can I make this ahead of time?

            Absolutely. After baking, let them cool completely, then wrap each layer individually with plastic wrap and refrigerate. They should last for up to a week! Layers can also be doubled wrapped and place in the freezer for a few months. You can frost from frozen and then let thaw for easy frosting! 

            You can also shred your carrots ahead of time to make the assembly of the cake super quick. They'll last in the fridge for a few days. 

            We don't typically recommend making the frosting too far in advance as it is easier to use right after making it. If you want to make it ahead of time we would recommend refrigerating it and then letting it come to room temperature before attempting to frost your cake. Stir it every so often to help speed this along or put it in a bowl and beat with a hand mixer to help soften it. 

            If you love this cake as much as we do, don't forget to leave a comment and rate it below! 
        """.trimIndent(), ingredients = """
            FOR THE CAKE :
            Cooking spray
            3 c. all-purpose flour
            1 1/2 tsp. kosher salt
            2 tsp. baking soda
            2 tsp. cinnamon
            2 c. granulated sugar
            1 1/2 c. vegetable oil
            4 large eggs
            1 tsp. pure vanilla extract
            3 c. grated carrots
            1 c. pecans, roughly chopped, plus more for garnish
            1 c. rasisins
            
            FOR THE CREAM CHEESE FROSTING :
            1 (8-oz.) block cream cheese, softened
            1/2 c. (1 stick) butter, softened
            1 tsp. pure vanilla extract
            4 c. powdered sugar
        """.trimIndent(),
            direction = """
            1. Preheat oven to 350° and grease 2 - 8" round cake pans with cooking spray. In a large bowl, whisk together flour, salt, baking soda, and cinnamon.
            
            2. In another large bowl with a hand mixer (or in the bowl of a stand mixer), beat together sugar and oil until well combined. Add eggs one at a time beating well after each addition, then add vanilla. Mix in dry ingredients until just combined. Stir in carrots, pecans, and raisins.
            
            3. Divide batter evenly between prepared pans. Bake until a toothpick inserted into the middle comes out clean, 45 minutes. Let cool 15 minutes then invert cakes onto a cooling rack and let cool completely.
            
            4. Make frosting: In a large bowl with a hand mixer, beat together cream cheese and butter until smooth. Add vanilla and powdered sugar and beat again until smooth and a spreadable consistency.
            
            5. Frost cake as desired and garnish with pecans. 
        """.trimIndent()
        ),


        FoodRecipe(
            id = 9,
            creatorName = "Makinze Gore",
            creatorPhoto ="https://hips.hearstapps.com/rover/profile_photos/743afec2-8cb0-4247-8722-05b4d891fe7a_1576786937.file?fill=1:1&resize=80:*",
            foodPhoto = "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/190313-braised-lamb-shanks-vertical-1-1553026902.png?crop=1.00xw:0.667xh;0,0.184xh&resize=768:*",
            foodName = "Braised Lamb Shanks",
            story = "Braising lamb shanks might sound a little intimidating, but honestly, it couldn't be easier. After a quick sear, the oven does all the work for you! Lamb shanks can tend to be a tougher cut of meat so to get tender, fall off the bone lamb, it works best to cook them low and slow. They'll braise in a savory tomato sauce that gives the meat so much flavor and the sauce becomes extra silky after the wine and butter gets stirred in. You'll have the most comforting dinner you've had all year! ",
            ingredients = """
                    6 lamb shanks
                    Kosher salt
                    Freshly ground black pepper
                    2 tbsp. extra-virgin olive oil
                    4 tbsp. butter, divided
                    1 onion, chopped
                    2 medium carrots, peeled and finely chopped
                    3 cloves garlic, minced
                    2 tbsp. tomato paste
                    2 c. low-sodium beef broth
                    1 (15-oz.) can tomato sauce
                    2 sprigs rosemary
                    1 c. red wine
                """.trimIndent(), direction = """
                    1. Preheat oven to 350°. Season lamb shanks with salt and pepper. In a large Dutch oven over medium-high heat, heat oil. Add lamb and cook until golden all over, about 4 minutes per side. Work in batches as necessary. Remove lamb from pot and place on a plate.
                     
                    2. In the pot, melt 2 tablespoons butter over medium heat. Add onion and carrots and cook until soft, 4 minutes. Add garlic and cook until fragrant, 1 minute more, then add tomato paste and stir until vegetables are coated.
                     
                    3. Pour in broth and tomato sauce, then return lamb shanks to pot. Add rosemary and bring to a boil. Cover and transfer to oven. Cook until lamb shanks are completely tender, 2 hours.
                    
                    4. Remove lamb from pot and place on a cutting board. Tent with foil to keep warm. Discard rosemary.
                     
                    5. Return pot to stove over medium heat. Add wine and bring to a boil. Reduce heat and let simmer until thickened, 10 minutes. Stir in remaining 2 tablespoons butter.
                     
                    6. Serve lamb with mashed potatoes and spoon sauce on top.
                """.trimIndent()
        ),


        FoodRecipe(
            id = 10,
            creatorName = "Makinze Gore",
            creatorPhoto = "https://hips.hearstapps.com/rover/profile_photos/743afec2-8cb0-4247-8722-05b4d891fe7a_1576786937.file?fill=1:1&resize=80:*",
            foodName = "Steamed Asparagus",
            foodPhoto = "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/190313-steamed-asparague-horizontal-1-1553026904.png?crop=0.595xw:0.893xh;0.180xw,0.0485xh&resize=768:*",
            story = "Steaming vegetables is the healthiest way to prepare them—so we finished ours with some butter, just to be safe (but you can totally skip or use some olive oil to keep things dairy free). These cook up so fast for a simple and quick side dish to complete any meal, like the Garlic Parmesan Flounder you just made. It's one of those sides for when you forget to plan a side.",
            ingredients = """
            1 lb. asparagus, ends trimmed
            2 tbsp. butter, melted
            Kosher salt
            Freshly ground black pepper
            Lemon wedges, for serving
        """.trimIndent(),
            direction = """
            1. In a large skillet over medium heat, add asparagus. Add enough water to just cover the bottom of the pan. Cover and let steam until asparagus is easily pierced with a knife, 3 to 5 minutes. 
            
            2. Toss asparagus with butter and season with salt and pepper. Serve with lemon wedges.
        """.trimIndent()
        )
    )




